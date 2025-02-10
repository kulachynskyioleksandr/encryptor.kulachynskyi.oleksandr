# Caesar Cipher Project


## 🎯 Project Overview
This project implements a simple Caesar Cipher encryption and decryption tool. The tool supports encrypting and decrypting text-based files using a shift key provided by the user. The encryption is based on shifting letters within a predefined alphabet that includes uppercase and lowercase English letters, punctuation, and spaces.

## 💡 Features
 - Encrypts and decrypts text files using the Caesar Cipher algorithm.
 - Supports an extended alphabet that includes punctuation.
 - Reads input from files and writes encrypted/decrypted content to new files.
 - Command-line interface for user interaction.
 - Input validation for file paths and cipher keys.



## 🛠️ Installation and Setup

### Steps to Run the Project 
1. Clone the repository:

>git clone https://github.com/kulachynskyioleksandr/encryptor.kulachynskyi.oleksandr

2. Open the project in IntelliJ IDEA:
- Open IntelliJ IDEA, click on Open, and select the cloned project directory.

3. Build the project:
- IntelliJ will automatically detect and build the project. If not, go to Build > Build Project.

4. Run the program:
- Go to Run > Edit Configurations.
- Create a new Application configuration and select your main class (encryptor.kulachynskyi.oleksandr.Main). 
- Click Run to execute the program.



## 💻 Command-Line Usage

### To encrypt:

You can run the program directly with arguments:
>java -jar ".../encryptor.kulachynskyi.oleksandr.jar" (ENCRYPT/DECRYPT) ("file-path") (key)

Example:
>java -jar ".../encryptor.kulachynskyi.oleksandr.jar" ENCRYPT ".../input.txt" 3

`This will create a new file input[ENCRYPTED].txt with encrypted content.`


### To decrypt:
>java -jar ".../encryptor.kulachynskyi.oleksandr.jar" DECRYPT ".../input.txt" 3

`This will create a new file input[DECRYPTED].txt with the original content restored.`



## ⚙️ Code Explanation

### CaesarCipher.java
 - Implements the encryption and decryption logic.
 - Uses the Alphabet class to handle character shifting.
 - Provides methods to process files.


### FileService.java
 - Reads and writes text files.

### Main.java
 - Entry point of the application.
 - Parses command-line arguments and invokes encryption/decryption.

### Alphabet.java
 - Defines a custom alphabet including letters, punctuation, and spaces.

### CLI.java
 - Provides an interactive command-line interface when no arguments are provided.

### InputValidator.java
 - Ensures valid key and file paths.
