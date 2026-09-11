# Implementación de un Servicio de Procesamiento de Pagos

La empresa Fintech 'PagoSeguro' necesita un servicio robusto para procesar pagos de manera eficiente y segura. El sistema debe manejar diferentes métodos de pago, validar transacciones, y asegurar la consistencia de los datos. El objetivo es desarrollar un servicio que pueda integrarse con múltiples pasarelas de pago y gestionar las solicitudes de pago de manera efectiva.

## Informacion General

| Campo | Valor |
|-------|-------|
| **Tema** | Desarrollo |
| **Nivel** | senior-l2 |
| **Tipo** | practical |
| **Tiempo estimado** | 5-7 horas |

## Fases del Reto

### Fase 0: Configuración del Proyecto

**Objetivo:** Obtener el proyecto base funcional enviando el Código Base a un asistente de IA, que lo analizará, corregirá errores y generará un ZIP listo para usar.

**Tiempo estimado:** 15-30 minutos

**Instrucciones:**

- Asegúrate de tener instalado para ejecutar el proyecto: JDK 17+, Maven 3.9+, IDE con soporte Java.
- Copia todo el contenido del campo **Código Base** de este reto — incluyendo el texto de instrucciones que aparece al inicio.
- Abre un asistente de IA (Claude en claude.ai, ChatGPT o Gemini — se recomienda Claude), pega el contenido copiado en el chat y envíalo.
- El asistente analizará los archivos, corregirá errores y generará un archivo ZIP descargable. Descárgalo y extráelo en la carpeta donde quieras trabajar.
- Ejecuta `mvn compile` en la raíz. Si no hay errores, estás listo.

**Entregable:** El proyecto compila/arranca sin errores.

<details>
<summary>Pistas de conocimiento</summary>

- Copia el Código Base completo incluyendo el texto de instrucciones al inicio — esas instrucciones le indican al asistente exactamente qué hacer con los archivos.
- Si el asistente no genera el ZIP automáticamente al terminar el análisis, escríbele: "genera el ZIP ahora".
- Si el proyecto tiene errores al arrancar, comparte el mensaje de error con el mismo asistente para que lo corrija.

</details>

### Fase 1: Definición de Requisitos y Especificaciones

**Objetivo:** Definir los requisitos funcionales y no funcionales del servicio de procesamiento de pagos.

**Tiempo estimado:** 1 hora

**Instrucciones:**

- Identifica los métodos de pago que el servicio debe soportar (tarjeta de crédito, débito, transferencia bancaria, etc.).
- Especifica las validaciones necesarias para cada tipo de pago (por ejemplo, verificación de datos de la tarjeta, saldo disponible, etc.).
- Define los criterios de aceptación para el servicio (por ejemplo, tiempo de respuesta, tasa de éxito, etc.).

**Entregable:** Documento de especificación de requisitos

<details>
<summary>Pistas de conocimiento</summary>

- Considera las regulaciones y normativas aplicables a los servicios de pago.
- Piensa en la escalabilidad y la seguridad del servicio.

</details>

### Fase 2: Diseño del Servicio

**Objetivo:** Diseñar la arquitectura del servicio de procesamiento de pagos.

**Tiempo estimado:** 2 horas

**Instrucciones:**

- Diseña la estructura general del servicio, incluyendo los componentes principales y sus interacciones.
- Identifica las dependencias externas (pasarelas de pago, servicios de validación, etc.) y cómo se integrarán con el servicio.
- Define los puntos de entrada y salida del servicio (APIs, webhooks, etc.).

**Entregable:** Diagrama de arquitectura del servicio

<details>
<summary>Pistas de conocimiento</summary>

- Considera el uso de patrones de diseño comunes en servicios de backend.
- Piensa en la modularidad y la reutilización de componentes.

</details>

### Fase 3: Implementación de la Lógica de Negocio

**Objetivo:** Implementar la lógica de negocio del servicio de procesamiento de pagos.

**Tiempo estimado:** 3 horas

**Instrucciones:**

- Implementa las validaciones y las reglas de negocio para cada método de pago.
- Maneja los casos de error y las excepciones de manera adecuada.
- Asegura la consistencia de los datos durante las transacciones.

**Entregable:** Código implementado de la lógica de negocio

<details>
<summary>Pistas de conocimiento</summary>

- Utiliza técnicas de programación defensiva para manejar errores y excepciones.
- Considera el uso de transacciones para asegurar la consistencia de los datos.

</details>

### Fase 4: Integración y Pruebas

**Objetivo:** Integrar el servicio con las dependencias externas y realizar pruebas exhaustivas.

**Tiempo estimado:** 2 horas

**Instrucciones:**

- Integra el servicio con las pasarelas de pago y otros servicios externos.
- Realiza pruebas unitarias y de integración para verificar el funcionamiento del servicio.
- Identifica y corrige cualquier problema detectado durante las pruebas.

**Entregable:** Servicio integrado y probado

<details>
<summary>Pistas de conocimiento</summary>

- Utiliza herramientas de testing para automatizar las pruebas.
- Considera el uso de mocks para simular las dependencias externas durante las pruebas.

</details>

## Dimensiones Evaluadas

- **queEs**: ¿Cuál es el propósito principal del servicio de procesamiento de pagos?
- **paraQueSirve**: ¿Por qué es importante integrar el servicio con múltiples pasarelas de pago?
- **comoSeUsa**: ¿Cómo se asegura la consistencia de los datos durante las transacciones?
- **erroresComunes**: ¿Cuáles son los errores más comunes que pueden ocurrir durante la implementación de la lógica de negocio?
- **queDecisionesImplica**: ¿Qué decisiones de diseño tomaste para asegurar la modularidad y la reutilización de componentes?

## Criterios de Evaluacion

- Definición clara de requisitos y especificaciones del servicio.
- Diseño robusto y modular de la arquitectura del servicio.
- Implementación correcta de la lógica de negocio y manejo de errores.
- Integración exitosa con dependencias externas y pruebas exhaustivas.

## Como trabajar con un asistente de IA

- **AGENTS.md** — instrucciones nativas del repo (Cursor, Codex, Copilot, Gemini, Claude Code). Abrí el proyecto y el agente las carga solo.
- **PROMPT_MEJORA.md** — el mismo prompt, para copiar y pegar en un chat (claude.ai, ChatGPT, etc.).

---

*Reto generado automaticamente por Challenge Generator - Pragma*
