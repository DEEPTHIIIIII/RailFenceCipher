# Rail Fence Cipher Encryption and Decryption

This Java program implements the **Rail Fence Cipher** encryption and decryption technique. The Rail Fence Cipher is a transposition cipher that rearranges characters by placing them in a zigzag pattern across multiple rails (rows). It has two main operations: **encryption** and **decryption**.

## How It Works

1. **Encryption**:
   - The text is written in a zigzag pattern across several rails.
   - The characters are read row by row to create the encrypted text.
   
2. **Decryption**:
   - To decrypt the cipher text, the rails are re-formed in the zigzag pattern.
   - The text is then read in the original zigzag order to recover the plain text.

## Input and Output

- The user is prompted to choose between encrypting or decrypting a text.
- The text is processed by the Rail Fence Cipher, and the result is displayed.

## Program Structure

### Methods:

1. **`encrypt(String s, int depth)`**:
   - **Parameters**: 
     - `s`: The plain text to be encrypted.
     - `depth`: The number of rails (depth of the zigzag pattern).
   - This method fills the rails with the input text and reads the characters row by row to produce the encrypted text.
   
   **Example**:
   ```
   Input: "HELLO" with depth 3
   Output: Encrypted text: "HOELL"
   ```

2. **`decrypt(String s, int depth)`**:
   - **Parameters**: 
     - `s`: The cipher text to be decrypted.
     - `depth`: The number of rails used during encryption.
   - This method reconstructs the zigzag pattern by placing markers ('!') where characters were originally placed, and then substitutes the actual characters to retrieve the plain text.

   **Example**:
   ```
   Input: "HOELL" with depth 3
   Output: Decrypted text: "HELLO"
   ```

3. **`main(String[] args)`**:
   - The entry point of the program. It provides a menu to the user:
     1. **Encrypt** a plain text.
     2. **Decrypt** a cipher text.
   - It reads the text and the depth value from the user and calls the appropriate method based on their choice.

## How to Use the Program

1. **Compile and Run** the program in any Java environment.
2. When prompted:
   - Choose `1` to **encrypt** the text.
   - Choose `2` to **decrypt** the text.
3. Enter the plain text (for encryption) or the cipher text (for decryption), followed by the **depth** (number of rails).

### Example:

**For Encryption**:
```
Enter 1 to encrypt the text
Enter the plain text to encrypt: HELLO WORLD
Enter the depth to be used to encrypt: 3
Encrypted text using Rail Fence Cipher technique is: HOLELWRLOD
```

**For Decryption**:
```
Enter 2 to decrypt the text
Enter the cipher text to decrypt: HOLELWRLOD
Enter the depth to be used to decrypt: 3
Decrypted text using Rail Fence Technique: HELLOWORLD
```

## Constraints and Assumptions

- The program only considers alphabetic characters (A-Z) and converts the input to **uppercase**.
- Non-alphabetic characters are removed during encryption and decryption.

## Notes

- Ensure that the same depth is used for both encryption and decryption for accurate results.
- The program uses basic arrays for simulating the zigzag pattern on the rails.

## Requirements

- Java Development Kit (JDK) version 8 or higher.

## How to Run

1. Save the Java file as `RailFenceCipher.java`.
2. Open a terminal or command prompt and navigate to the file directory.
3. Compile the program using:
   ```bash
   javac RailFenceCipher.java
   ```
4. Run the program:
   ```bash
   java RailFenceCipher
   ```

Enjoy encrypting and decrypting your messages using the Rail Fence Cipher technique!
