# 🏺 DevArtifact by Dhoondlay

**High-utility, security-first "quiet dependencies" for the Java and JavaScript ecosystems.**

DevArtifact is a collection of curated, lightweight utilities designed to solve common engineering hurdles. Hosted by **Dhoondlay**, this project focuses on the "missing pieces" of the standard library—tools that ensure data integrity and security across the full stack.

---

## 🚀 Why DevArtifact?
In the modern ecosystem, developers often rewrite the same validation and sanitization logic. **DevArtifact** aims to be a single, trusted source for:
- **Cross-Stack Consistency:** Identical logic for Java (Backend) and JavaScript (Frontend).
- **Security-First Design:** Protecting against invisible character injections and path traversal.
- **Zero Overhead:** No external dependencies. Just pure, optimized code.

## 📦 What's Inside?
- **Universal-Sanitizer:** Removes zero-width spaces and malicious hidden characters.
- **Path-Guard:** Ensures OS-agnostic safe file pathing.
- **Type-Bridge:** (In Development) Consistent data-type validation for JSON-to-Java mapping.

## 🛠️ Quick Start
### Java (Maven/Gradle)
```java
import com.dhoondlay.devartifact.Sanitizer;
String safeInput = Sanitizer.stripHidden(userInput);
