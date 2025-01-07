# AES Encrypt-Decrypt File Program

This program implements file encryption and decryption using **AES (Advanced Encryption Standard)**, a widely-used symmetric encryption algorithm developed by **NIST**. 

## Features
- **Encryption**: Secures file contents using AES.
- **Decryption**: Restores original file contents using the same key.
- **Security**: Operates on fixed-size data blocks, with stronger encryption achievable through larger key sizes.

## About AES
- **Symmetric Algorithm**: A single key is used for both encryption and decryption.
- **Block-Based**: Encrypts fixed-size blocks of data, processing each block separately.
- **Key Strength**: Larger keys provide stronger security.

## Usage
1. Provide the file to be encrypted or decrypted.
2. Enter the encryption/decryption key (ensure the same key is used for both operations).
3. The program will output the encrypted or decrypted file.

## How It Works
This program utilizes AES encryption to secure file contents, ensuring data remains confidential. With a properly implemented key, users can easily encrypt and decrypt files without compromising security.

## Dependencies
- Java Development Kit (JDK)

## Installation
1. Install the Java Development Kit (JDK): [https://www.oracle.com/java/](https://www.oracle.com/java/)
2. Compile the program:
   ```
   javac AESFileEncryption.java
   ```
3. Run the program:
   ```
   java AESFileEncryption
   ```

## Example
1. Run the program.
2. Provide the key.
4. Encrypted/Decrypted file is saved to the specified location.

## Notes
- Keep your encryption key secure. If lost, decryption will not be possible.
- Larger key sizes (e.g., 256 bits) offer better security.

## Disclaimer
This program is designed for educational purposes. Ensure compliance with local laws and regulations when handling sensitive data.
