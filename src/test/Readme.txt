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


your-maven-project/
├── src/
│   ├── main/
│   │   └── java/                        # (If needed for application code)
│   └── test/
│       ├── java/
│       │   ├── stepdefinitions/         # ✅ Step definitions go here
│       │   │   └── LoginSteps.java
│       │   └── runners/                 # ✅ TestNG Runner goes here
│       │       └── TestNGRunner.java
│       └── resources/
│           └── features/                # ✅ Gherkin feature files go here
│               └── login.feature



Glue Value                        | Allowed? | Notes
---------------------------------|----------|------------------------------
"stepdefinitions"                |   Yes    | Single package
"com.example.steps"              |   Yes    | Fully qualified package
"com.example.steps.LoginSteps"   |   No     | Class name → Not allowed
{"steps", "hooks"}               |   Yes    | Multiple packages allowed



Features Value                                   | Runs                               | Notes
-------------------------------------------------|------------------------------------|--------------------------------------------
"src/test/resources/features"                    | All .feature files in this folder  | Runs all feature files recursively
"src/test/resources/features/login.feature"      |Only the login.feature file         | Runs a single specific feature file
{ "file1.feature", "file2.feature" }             | Only those specified feature files | Runs multiple specified feature files
