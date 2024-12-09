# Sandwich Builder Ingredients API

A Spring Boot application for managing sandwich ingredients. This REST API allows you to create, retrieve, and manage different types of ingredients for sandwich making, including meats, cheeses, breads, vegetables, and sauces.

## Technology Stack

- Spring Boot 3.2.1
- SQLite Database
- JPA/Hibernate
- Maven

## Getting Started

### Prerequisites

- Java 17 or higher
- Maven

### Running the Application

1. Clone the repository
2. Navigate to the project directory
3. Run:

```bash
mvn spring-boot:run
```

The application will start on `http://localhost:8080`

## API Endpoints

- `GET /api/ingredients` - List all ingredients
- `GET /api/ingredients/{id}` - Get ingredient by ID
- `GET /api/ingredients/type/{type}` - Get ingredients by type
- `POST /api/ingredients` - Create new ingredient

## Database Seeding

Use the following curl commands to populate the database with initial ingredients:

### Meats

```bash
curl -X POST http://localhost:8080/api/ingredients -H "Content-Type: application/json" -d '{"name": "Ham", "type": "Meat"}'
curl -X POST http://localhost:8080/api/ingredients -H "Content-Type: application/json" -d '{"name": "Turkey", "type": "Meat"}'
curl -X POST http://localhost:8080/api/ingredients -H "Content-Type: application/json" -d '{"name": "Roast Beef", "type": "Meat"}'
curl -X POST http://localhost:8080/api/ingredients -H "Content-Type: application/json" -d '{"name": "Salami", "type": "Meat"}'
curl -X POST http://localhost:8080/api/ingredients -H "Content-Type: application/json" -d '{"name": "Pastrami", "type": "Meat"}'
curl -X POST http://localhost:8080/api/ingredients -H "Content-Type: application/json" -d '{"name": "Prosciutto", "type": "Meat"}'
```

### Cheeses

```bash
curl -X POST http://localhost:8080/api/ingredients -H "Content-Type: application/json" -d '{"name": "Cheddar", "type": "Cheese"}'
curl -X POST http://localhost:8080/api/ingredients -H "Content-Type: application/json" -d '{"name": "Swiss", "type": "Cheese"}'
curl -X POST http://localhost:8080/api/ingredients -H "Content-Type: application/json" -d '{"name": "Provolone", "type": "Cheese"}'
curl -X POST http://localhost:8080/api/ingredients -H "Content-Type: application/json" -d '{"name": "American", "type": "Cheese"}'
curl -X POST http://localhost:8080/api/ingredients -H "Content-Type: application/json" -d '{"name": "Mozzarella", "type": "Cheese"}'
```

### Breads

```bash
curl -X POST http://localhost:8080/api/ingredients -H "Content-Type: application/json" -d '{"name": "White", "type": "Bread"}'
curl -X POST http://localhost:8080/api/ingredients -H "Content-Type: application/json" -d '{"name": "Wheat", "type": "Bread"}'
curl -X POST http://localhost:8080/api/ingredients -H "Content-Type: application/json" -d '{"name": "Rye", "type": "Bread"}'
curl -X POST http://localhost:8080/api/ingredients -H "Content-Type: application/json" -d '{"name": "Sourdough", "type": "Bread"}'
curl -X POST http://localhost:8080/api/ingredients -H "Content-Type: application/json" -d '{"name": "Italian", "type": "Bread"}'
```

### Vegetables

```bash
curl -X POST http://localhost:8080/api/ingredients -H "Content-Type: application/json" -d '{"name": "Lettuce", "type": "Vegetable"}'
curl -X POST http://localhost:8080/api/ingredients -H "Content-Type: application/json" -d '{"name": "Tomato", "type": "Vegetable"}'
curl -X POST http://localhost:8080/api/ingredients -H "Content-Type: application/json" -d '{"name": "Onion", "type": "Vegetable"}'
curl -X POST http://localhost:8080/api/ingredients -H "Content-Type: application/json" -d '{"name": "Cucumber", "type": "Vegetable"}'
curl -X POST http://localhost:8080/api/ingredients -H "Content-Type: application/json" -d '{"name": "Bell Pepper", "type": "Vegetable"}'
curl -X POST http://localhost:8080/api/ingredients -H "Content-Type: application/json" -d '{"name": "Pickles", "type": "Vegetable"}'
```

### Sauces

```bash
curl -X POST http://localhost:8080/api/ingredients -H "Content-Type: application/json" -d '{"name": "Mayo", "type": "Sauce"}'
curl -X POST http://localhost:8080/api/ingredients -H "Content-Type: application/json" -d '{"name": "Mustard", "type": "Sauce"}'
curl -X POST http://localhost:8080/api/ingredients -H "Content-Type: application/json" -d '{"name": "Ranch", "type": "Sauce"}'
curl -X POST http://localhost:8080/api/ingredients -H "Content-Type: application/json" -d '{"name": "Oil & Vinegar", "type": "Sauce"}'
curl -X POST http://localhost:8080/api/ingredients -H "Content-Type: application/json" -d '{"name": "Chipotle Mayo", "type": "Sauce"}'
curl -X POST http://localhost:8080/api/ingredients -H "Content-Type: application/json" -d '{"name": "Honey Mustard", "type": "Sauce"}'
```

### Verify Data

Check ingredients by type:

```bash
curl http://localhost:8080/api/ingredients/type/Meat
curl http://localhost:8080/api/ingredients/type/Cheese
curl http://localhost:8080/api/ingredients/type/Bread
curl http://localhost:8080/api/ingredients/type/Vegetable
curl http://localhost:8080/api/ingredients/type/Sauce
```

## Database

The application uses SQLite and will create a file called `ingredients.db` in your project root directory. This file contains all the ingredient data and will persist between application restarts.
