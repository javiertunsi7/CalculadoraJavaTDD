# Calculadora TDD — Java

Proyecto de calculadora básica en Java aplicando metodología **TDD (Test-Driven Development)** y principios **SOLID**.

## Tecnologías

- Java 17
- Maven
- JUnit 5

## Estructura del proyecto

```
calculadora-tdd/
├── src/
│   ├── main/java/com/calculadora/
│   │   ├── ICalculator.java   ← Interfaz (contrato)
│   │   ├── Calculator.java    ← Implementación de la lógica
│   │   └── Main.java          ← Entrada del programa (I/O)
│   └── test/java/com/calculadora/
│       └── CalculatorTest.java ← Tests TDD
├── pom.xml
└── README.md
```

## Cómo ejecutar

```bash
# Ejecutar todos los tests
mvn test

# Compilar y ejecutar la aplicación
mvn compile exec:java -Dexec.mainClass="com.calculadora.Main"
```

## Métodos disponibles

| Método       | Descripción                                          |
|--------------|------------------------------------------------------|
| `add`        | Suma dos números                                     |
| `subtract`   | Resta el segundo número del primero                  |
| `multiply`   | Multiplica dos números                               |
| `divide`     | Divide (lanza excepción si el divisor es cero)       |

## Tests

> *(Añadir aquí captura de pantalla de `mvn test` con los 16 tests en verde)*

### Casos cubiertos por operación

| Operación        | Casos de prueba                                              |
|------------------|--------------------------------------------------------------|
| **Suma**         | Dos positivos, positivo+negativo, dos negativos, con cero    |
| **Resta**        | Dos positivos, resultado negativo, dos negativos, con cero   |
| **Multiplicación** | Dos positivos, por negativo, por cero, dos negativos       |
| **División**     | Dos positivos, resultado decimal, dividendo negativo, ÷ cero |

## Principios SOLID aplicados

| Principio | Aplicación |
|-----------|-----------|
| **S** — Single Responsibility | `Calculator` solo calcula. `Main` solo gestiona I/O |
| **O** — Open/Closed | Se puede crear `ScientificCalculator implements ICalculator` sin modificar `Calculator` |
| **L** — Liskov Substitution | Cualquier `ICalculator` puede sustituirse por otra implementación |
| **I** — Interface Segregation | `ICalculator` es pequeña y específica, sin métodos innecesarios |
| **D** — Dependency Inversion | `Main` y los tests dependen de `ICalculator`, no de `Calculator` directamente |
