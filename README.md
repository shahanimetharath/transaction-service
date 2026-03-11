# Transaction Microservice

## Architecture

Spring Boot REST API + PostgreSQL database.
The service is containerized using Docker and deployed to Render.

## API Endpoints

GET /api/health
GET /api/transactions
POST /api/transactions
GET /actuator/metrics
GET /actuator/health

## Running Locally

docker-compose up --build

## Docker

The service is packaged into a Docker container and orchestrated with docker-compose.

## Monitoring

Spring Boot Actuator exposes:

/actuator/health
/actuator/metrics

## Deployment

Deployed on Render using Docker.

Live URL:
[https://your-url.onrender.com/api/health](https://transaction-service-hopn.onrender.com/api/health)
