<div align="center">

# 🔍 Finggu Code Climate Checker

### Analyze • Validate • Improve Code Quality

A lightweight Spring Boot REST API that demonstrates a simple code quality analysis workflow and provides a foundation for building a complete Code Climate style analysis platform.

<p>

![Java](https://img.shields.io/badge/Java-17+-orange?style=for-the-badge&logo=openjdk)
![Spring Boot](https://img.shields.io/badge/Spring_Boot-3.x-6DB33F?style=for-the-badge&logo=springboot)
![PostgreSQL](https://img.shields.io/badge/PostgreSQL-Database-blue?style=for-the-badge&logo=postgresql)
![REST API](https://img.shields.io/badge/REST-API-success?style=for-the-badge)
![License](https://img.shields.io/badge/License-MIT-blue?style=for-the-badge)

</p>

---

**A clean foundation for building automated code quality, maintainability, and static analysis services.**

</div>

---

# 📖 Table of Contents

- Overview
- Features
- Technology Stack
- Project Structure
- Getting Started
- Installation
- Configuration
- Running the Application
- API
- Example Response
- Architecture
- Future Roadmap
- Contributing
- License
- Author

---

# 🚀 Overview

**Finggu Code Climate Checker** is a Spring Boot application designed to serve as the foundation for a code quality analysis platform.

It exposes REST endpoints that return code analysis results while providing a scalable architecture that can later integrate with:

- SonarQube
- PMD
- Checkstyle
- SpotBugs
- GitHub Actions
- GitLab CI
- Jenkins
- Code Climate Engines

The current version demonstrates the project architecture and API flow while remaining lightweight and easy to extend.

---

# ✨ Features

✅ Spring Boot REST API

✅ Layered Architecture

- Controller
- Service
- Repository
- Model
- Configuration
- Utility

✅ PostgreSQL Integration

✅ JPA Repository Support

✅ Simple Code Analysis Endpoint

✅ Validation Utility

✅ Easy to Extend

---

# 🛠 Technology Stack

| Technology | Version |
|------------|----------|
| Java | 17+ |
| Spring Boot | Latest |
| Spring Web | ✔ |
| Spring Data JPA | ✔ |
| PostgreSQL | ✔ |
| Maven | ✔ |

---

# 📂 Project Structure

```
src
 ├── main
 │   ├── java
 │   │   └── com.finggu.codeclimatechecker
 │   │
 │   │      ├── config
 │   │      ├── model
 │   │      ├── repository
 │   │      ├── service
 │   │      ├── util
 │   │      ├── web
 │   │      └── FingguCodeClimateCheckerApplication
 │   │
 │   └── resources
 │        ├── application.properties
 │        ├── schema.sql
 │        └── data.sql
 │
 └── test
```

---

# ⚙ Getting Started

## Clone Repository

```bash
git clone https://github.com/sudarshanpjadhav/finggu-code-climate-checker.git
```

```bash
cd finggu-code-climate-checker
```

---

# 📦 Installation

Build the project

```bash
mvn clean install
```

or

```bash
mvn package
```

---

# ⚙ Configuration

Update your database credentials inside:

```
src/main/resources/application.properties
```

Example:

```properties
spring.datasource.url=jdbc:postgresql://localhost:5432/codeclimatechecker

spring.datasource.username=codeclimatechecker

spring.datasource.password=password
```

---

# ▶ Running

Using Maven

```bash
mvn spring-boot:run
```

or

```bash
java -jar target/*.jar
```

Application starts at

```
http://localhost:8080
```

---

# 🌐 REST API

## Get Code Analysis

### Endpoint

```
GET /code-analysis
```

### Example

```
GET http://localhost:8080/code-analysis
```

---

# 📤 Sample Response

```json
[
  {
    "result": "pass",
    "message": "No issues found"
  }
]
```

---

# 🏗 Architecture

```
             Client

                │

                ▼

      REST Controller

                │

                ▼

      Analysis Service

                │

                ▼

      Repository Layer

                │

                ▼

          PostgreSQL
```

---

# 📌 Current Components

### Controller

Handles REST requests.

```
FingguCodeClimateCheckerController
```

---

### Service

Business logic for analysis.

```
FingguCodeAnalysisService
```

---

### Repository

Database interaction using Spring Data JPA.

```
FingguCodeClimateCheckerRepository
```

---

### Model

Stores analysis results.

```
FingguCodeClimateCheckResult
```

---

### Utility

Provides helper methods for Java code validation.

```
FingguUtil
```

---

# 🚀 Future Roadmap

The project is intentionally designed so these capabilities can be added easily.

- SonarQube integration
- Multi-language analysis
- GitHub repository scanning
- Pull Request analysis
- Static code analysis
- Security vulnerability detection
- Cyclomatic complexity
- Maintainability Index
- Duplicate code detection
- Technical debt estimation
- HTML reports
- PDF reports
- Email notifications
- Docker support
- Kubernetes deployment
- GitHub Actions
- Jenkins pipeline
- Authentication
- Dashboard UI

---

# 🧪 Testing

Run tests using

```bash
mvn test
```

---

# 🤝 Contributing

Contributions are welcome!

1. Fork the repository

2. Create a feature branch

```bash
git checkout -b feature/new-feature
```

3. Commit

```bash
git commit -m "Add new feature"
```

4. Push

```bash
git push origin feature/new-feature
```

5. Create a Pull Request

---

# 💡 Why this Project?

Modern development teams need fast and automated feedback on code quality.

Finggu Code Climate Checker provides a simple, extensible architecture that can evolve into a complete automated code review and quality platform integrated into modern CI/CD pipelines.

---

# 📜 License

This project is licensed under the **MIT License**.

---

# 👨‍💻 Author

**Sudarshan Jadhav**

Founder — Finggu

🌐 https://finggu.com

GitHub

https://github.com/sudarshanpjadhav

---

<div align="center">

### ⭐ If you like this project, consider giving it a Star!

Made with ❤️ by **Finggu**

</div>
