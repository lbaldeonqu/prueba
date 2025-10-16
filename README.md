# Prueba Técnica - Cucumber BDD Testing

Este proyecto es una prueba técnica completa que demuestra el uso de **Cucumber** para testing BDD (Behavior Driven Development) en Java con Maven.

## 🚀 Características

- ✅ **Features completos** con scenarios y examples
- ✅ **Step definitions** implementadas en Java
- ✅ **Aplicaciones de ejemplo** (Calculadora y gestión de usuarios)
- ✅ **Configuración Maven** completa
- ✅ **Múltiples test runners** para ejecución flexible
- ✅ **Reportes HTML** generados automáticamente

## 📁 Estructura del Proyecto

```
├── src/
│   ├── main/java/com/pruebatecnica/
│   │   ├── Calculadora.java           # Operaciones matemáticas básicas
│   │   ├── Usuario.java               # Modelo de usuario con validaciones
│   │   └── UsuarioService.java        # Servicio de gestión de usuarios
│   └── test/
│       ├── java/com/pruebatecnica/
│       │   ├── runners/
│       │   │   ├── TestRunner.java               # Runner principal
│       │   │   ├── CalculadoraTestRunner.java    # Runner específico calculadora
│       │   │   └── UsuarioTestRunner.java        # Runner específico usuarios
│       │   └── stepdefinitions/
│       │       ├── CalculadoraSteps.java         # Steps para calculadora
│       │       └── UsuarioSteps.java             # Steps para usuarios
│       └── resources/features/
│           ├── calculadora.feature               # Scenarios de calculadora
│           └── usuario.feature                   # Scenarios de usuarios
├── pom.xml                            # Configuración Maven
└── README.md                          # Este archivo
```

## 🛠️ Tecnologías Utilizadas

- **Java 11+**
- **Maven 3.6+**
- **Cucumber 7.18.0**
- **JUnit 5**
- **AssertJ** para assertions más legibles

## 📋 Características de los Features

### 🧮 Calculadora (calculadora.feature)
- **Operaciones básicas**: suma, resta, multiplicación, división
- **Esquema de escenarios** con examples para múltiples combinaciones
- **Manejo de errores**: división por cero
- **Números decimales** con aproximaciones

### 👤 Gestión de Usuarios (usuario.feature)
- **Registro de usuarios** con validaciones completas
- **Esquema de escenarios** para diferentes casos de registro
- **Login exitoso y fallido**
- **Validaciones**: campos obligatorios, formato email, longitud contraseña

## 🏃‍♂️ Cómo Ejecutar

### Prerrequisitos
- Java 11 o superior
- Maven 3.6 o superior

### Ejecutar todas las pruebas
```bash
mvn test
```

### Ejecutar solo pruebas de calculadora
```bash
mvn test -Dtest=CalculadoraTestRunner
```

### Ejecutar solo pruebas de usuarios
```bash
mvn test -Dtest=UsuarioTestRunner
```

### Generar reportes
```bash
mvn clean test
```

Los reportes se generan en:
- `target/cucumber-reports.html` - Reporte principal
- `target/cucumber-reports-calculadora.html` - Reporte de calculadora
- `target/cucumber-reports-usuario.html` - Reporte de usuarios
- `target/cucumber-reports/` - Reportes en JSON y XML

## 📊 Ejemplos de Scenarios

### Ejemplo con Esquema de Escenario (Calculadora)
```gherkin
Esquema del escenario: Operaciones matemáticas con múltiples valores
  Dado que ingreso el número <numero1>
  Y que ingreso el número <numero2>
  Cuando realizo la operación <operacion>
  Entonces el resultado debe ser <resultado_esperado>

  Ejemplos:
    | numero1 | numero2 | operacion      | resultado_esperado |
    | 10      | 5       | suma           | 15                 |
    | 10      | 5       | resta          | 5                  |
    | 10      | 5       | multiplicacion | 50                 |
    | 10      | 5       | division       | 2                  |
```

### Ejemplo de Validaciones (Usuario)
```gherkin
Esquema del escenario: Registro de usuario con diferentes datos
  Dado que estoy en la página de registro
  Cuando ingreso el nombre "<nombre>"
  Y ingreso el email "<email>"
  Y ingreso la contraseña "<contraseña>"
  Y hago clic en registrar
  Entonces el resultado del registro debe ser "<resultado>"
  Y debe mostrar el mensaje "<mensaje>"

  Ejemplos:
    | nombre | email          | contraseña | resultado | mensaje                     |
    | Juan   | juan@test.com  | 12345678   | exitoso   | Usuario registrado correctamente |
    |        | sin@test.com   | 12345678   | error     | El nombre es obligatorio    |
```

## 🔧 Configuración Maven

El proyecto está configurado con:
- **Cucumber JUnit Platform Engine** para ejecución con JUnit 5
- **Plugin Surefire** para ejecutar tests
- **Reportes automáticos** en múltiples formatos
- **AssertJ** para assertions más expresivas

## 📝 Best Practices Implementadas

- ✅ **Step definitions reutilizables**
- ✅ **Manejo de excepciones** en steps
- ✅ **Validaciones completas** en modelos
- ✅ **Separación de responsabilidades**
- ✅ **Documentación en español** para mejor comprensión
- ✅ **Múltiples runners** para flexibilidad
- ✅ **Assertions expresivas** con AssertJ

## 🚀 Para Desarrolladores

### Agregar nuevos features
1. Crear archivo `.feature` en `src/test/resources/features/`
2. Implementar step definitions en `src/test/java/com/pruebatecnica/stepdefinitions/`
3. Crear runner específico si es necesario
4. Ejecutar con `mvn test`

### Agregar nueva funcionalidad
1. Crear clase en `src/main/java/com/pruebatecnica/`
2. Crear tests en step definitions
3. Actualizar features según necesidad

## 📈 Resultados Esperados

Al ejecutar las pruebas deberías ver:
- ✅ Todos los scenarios pasan exitosamente
- 📊 Reportes HTML generados
- 📋 Cobertura completa de casos de prueba
- 🔍 Validaciones de errores funcionando

Este proyecto es un excelente ejemplo de cómo implementar BDD con Cucumber en Java, siguiendo las mejores prácticas de la industria.