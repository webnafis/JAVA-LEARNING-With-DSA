## Getting Started

Welcome to the VS Code Java world. Here is a guideline to help you get started to write Java code in Visual Studio Code.

## Folder Structure

The workspace contains two folders by default, where:

- `src`: the folder to maintain sources
- `lib`: the folder to maintain dependencies

Meanwhile, the compiled output files will be generated in the `bin` folder by default.

> If you want to customize the folder structure, open `.vscode/settings.json` and update the related settings there.

## Dependency Management

The `JAVA PROJECTS` view allows you to manage your dependencies. More details can be found [here](https://github.com/microsoft/vscode-java-dependency#manage-dependencies).

## How to run JAVA in VSCODE

To run Java in Visual Studio Code, follow these steps:
Install the Extension Pack for Java:
Open VS Code, go to the Extensions view (Ctrl+Shift+X), and search for "Extension Pack for Java." Install this extension pack, which includes essential tools like Language Support for Java, Debugger for Java, and Project Manager for Java.
Install a Java Development Kit (JDK):
If you don't already have one, the Extension Pack for Java will often prompt you to install a recommended JDK. Alternatively, you can download and install a JDK manually (e.g., from Oracle or AdoptOpenJDK) and ensure it's configured in your system's environment variables.
# create a new java project
Create or Open a Java Project:
New Project: Use the Command Palette (Ctrl+Shift+P), search for "Java: Create Java Project," and follow the prompts to create a new project (e.g., "No build tools").
Existing Project: Open the folder containing your Java project in VS Code.
Write Your Java Code:
Create a .java file within your project (e.g., App.java in the src folder of a new project) and write your Java code, including a main method for execution.
Run Your Program:
Run Button: If you have a main method, a "Run Java" button (a play icon) will typically appear in the top-right corner of the editor when viewing a Java file. Click this button to compile and run your code.
Right-Click: Right-click within the Java file and select "Run Java."
Debug: Set breakpoints (F9) and use the "Run and Debug" view (Ctrl+Shift+D) to debug your application.
Your program's output will appear in the VS Code integrated terminal.
