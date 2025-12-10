
# ‍🌌 PICODE

Picode is a Java numerical cipher that turns text into a sequence of coded numbers.  
Using randomness side by side with a **Picode Key**, it becomes practically impossible to decode manually — only a machine with the correct Key can decrypt it.

You can use it to encode sensitive text you don’t want others to see, such as passwords, plans, private notes or whatever you want.

Take a look at how it works and start using it today!

---



## 💻 HOW DOES IT WORK

### Code

The encoding process that transforms text into a Picode cipher is split into **two** simple parts:

1. 📅 **Date Time**: When your text is sent to the algorithm, the first thing it does is capture the current date and time. This information is stored in the first 92 digits of the code.

2. 🎲 **Random Numbers**: After the timestamp section, the text is transformed into random numbers.

### Decode

The decoding process to convert a Picode cipher back to text works like this:

1. 🌊 **Convert to Surface Code**:  
   To decode a Picode cipher, it must first be converted into a Surface Code - a simpler format that the algorithm can understand.

2. 📖 **Surface Code to Text**:  
   Then, the Surface Code is converted back into readable text.  
   This step is only possible using the **specific Picode Key used during encryption**.  
   Without the correct key, the message cannot be decoded properly.
   
---
## 🛠️ FEATURES

- **Encoder**: From text to code
- **Decoder**: From code to text
- **See id (key)**: To see your Picode Key
- **Read file**: Decode and read one of your Saved Codes
- **Saved Codes**: Save a coded text
- **Leave**: Close the program

---


## ♨ Technologies

- Programming language: **Java**

---
## ⚙ HOW TO INSTALL AND USE

### 🛠 Required Tools

_Click the tools below to learn how to install them (pt-BR videos):_

1. [Git](https://www.youtube.com/watch?v=Am46OOLgV4s)
2. [JDK (Java Development Kit)](https://www.youtube.com/watch?v=laC0fiI-IOM)

---

### 👣 Step by Step

1. Choose a folder, open **Git Bash** inside it and run:

```bash
git clone https://github.com/pierry-savio/picode.git
````

2. After cloning, open the "dist" folder and run:

```bash
java -jar Picode.jar
```

And that's it!
Picode will start running on your machine via terminal :)

---

## License

This project is licensed under the MIT License. See [LICENSE](https://choosealicense.com/licenses/mit/) for details.

---
## ✒ Authors

Made by **Pierry Savio**
- [LinkedIn - @pierry-dev](https://www.linkedin.com/in/pierry-dev/)
- [GitHub - @pierry-savio](https://github.com/pierry-savio)