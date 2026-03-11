package com.hopn.transaction_service.Controller;


import io.micrometer.core.instrument.MeterRegistry;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class MetricsController {

    private final MeterRegistry meterRegistry;

    public MetricsController(MeterRegistry meterRegistry) {
        this.meterRegistry = meterRegistry;
    }

    @GetMapping("/metrics")
    public double getRequestCount() {

        var timer = meterRegistry
                .find("http.server.requests")
                .timer();

        if (timer == null) {
            return 0;
        }

        return timer.count();
    }
}