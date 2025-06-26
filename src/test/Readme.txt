In a Maven-based project, feature files for Cucumber + Gherkin are placed in the src/test/resources directory. This is because Maven expects all test resources (like .feature files) to be located under src/test/resources.

Why under resources?
	• Maven convention: .java files go under src/test/java, and non-code resources (like .feature, .xml, .json, etc.) go under src/test/resources.
	• This structure ensures your feature files are automatically available in the classpath during test execution.


your-maven-project/
├── src/
│   ├── main/
│   │   └── java/                → Application source code (if any)
│   └── test/
│       ├── java/                → Step Definitions, Hooks, Test Runners
│       │   ├── stepdefinitions/
│       │   └── runners/
│       └── resources/
│           └── features/        → ✅ Gherkin `.feature` files go here
│               ├── login.feature
│               └── registration.feature


What's Mandatory and What's Flexible
🔐 Mandatory: Folder Placement
Maven expects:
	• Step definitions and runners → src/test/java/
	• Feature files → src/test/resources/
🎯 Flexible: Package Names
You can name your packages anything you like, as long as your runner class points correctly to:
	• The location of the .feature files via features = "..."
	• The location of the step definitions via glue = "..."
