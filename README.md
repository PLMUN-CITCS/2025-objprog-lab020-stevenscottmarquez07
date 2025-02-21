# **2025-OBJPROG-LAB020**
Week 05 - Methods in Java

Laboratory # 20 - Group Activity # 01 - Problem 04: Simple Menu-Driven Program with Function-Based

## **Instructions**

### **Step 1.1: Accept the Assignment**

   1. Click on the assignment link provided by your instructor.
   2. GitHub Classroom will create a **private repository** under your GitHub account.
   3. After the repository is created, click **"Go to Repository"** to view your assignment.

---

### **Step 1.2: Setup your Git Environment**
Only perform this if this is the first time you will setup your Git Environment

   1. Create a GitHub Account:
   ```bash
   https://github.com/signup?source=login
   ```
      
   2. Download and Install Git on your Laptop/Desktop:
   ```bash
   https://git-scm.com/downloads
   ```
   
   3. Create a Folder in your Laptop/Desktop
   4. Right-click anywhere in the created folder and select "Open Git Bash Here".
   5. In the Git Bash Terminal, set your git name, perform command:
   ```bash
   git config --global user.name "Your Name"
   ```
   
   6. In the Git Bash Terminal, set your git email, perform command:
   ```bash
   git config --global user.email "your.email@example.com"
   ```
   
   7. Create your SSH Key, just follow the instructions, no need to provide filename and passphrase. In the Git Bash Terminal, perform command:
   ```bash
   ssh-keygen -t rsa -b 4096 -C "your_email@example.com"
   ```
   
   8. Copy your SSH Keys into clipboard. In the Git Bash Terminal, perform command:
   ```bash
   clip < ~/.ssh/id_rsa.pub
   ```
   
   9. Log in to your GitHub account.
   10. In the upper-right corner of GitHub, click your profile picture and select Settings.
   11. In the left sidebar, click on SSH and GPG keys.
   12. Click the New SSH key button.
   13. In the Title field, give the key a recognizable name (e.g., "My Windows Laptop").
   14. In the Key field, CTRL + V or paste the keys copied into your clipboard. Save the key.
   15. Go Back to terminal, use command:
   ```bash
   ssh -T git@github.com
   ```

### **Step 2: Clone the Repository to Your Local Machine**

   1. On your repository page, click the green **"Code"** button.
   2. Copy the repository URL (choose HTTPS for simplicity).
   3. Open your terminal (or Git Bash, Command Prompt, or PowerShell) and run:
   
   ```bash
   git clone <git_repo_url>
   ```
   
   4. Navigate into the cloned folder:
   
   ```bash
   cd <git_cloned_folder>
   ```

### **Step 3: Complete the Assignment**

**Laboratory # 20 - Group Activity # 01 - Problem 04: Simple Menu-Driven Program with Function-Based**

   **Objective:**
   - Develop a menu-driven Java program that provides options to greet the user, check if a number is even or odd, or exit the program.
   - Demonstrate the use of methods to organize the program and improve modularity.

   **File Naming Convention:**
   - `MenuDrivenProgram.java`

   **Desired Output:**
   ```txt
   Menu:
   1. Greet User
   2. Check Even/Odd
   3. Exit
   Enter your choice (1-3): 1
   Hello! Welcome!
   
   Menu:
   1. Greet User
   2. Check Even/Odd
   3. Exit
   Enter your choice (1-3): 2
   Enter an integer: 33
   33 is an Odd number.
   
   Menu:
   1. Greet User
   2. Check Even/Odd
   3. Exit
   Enter your choice (1-3): 3
   Exiting program. Goodbye!
   ```

   **Notable Observations:**
   - This activity emphasizes the use of methods to create a modular and well-structured program.
   - Helper methods can be used to further break down tasks and improve code organization.

   **Java Programming Best Practices:**
   - Use meaningful method names that clearly describe their purpose.
   - Keep your methods concise and focused on a single task.
   - Add comments to your code to explain the logic and purpose of each method.
   - Validate user input to prevent unexpected errors.
   - Use helper methods to improve code organization and readability.
      
   **Method Requirements:**

   1. displayMenu()
      - Purpose: To display the menu options to the user.
      - Requirements:
         - Print the menu options to the console, clearly numbered.
            
   2. handleMenuChoice(choice)
      - Purpose: To execute the corresponding action based on the user's menu choice.
      - Requirements:
         - Take the user's choice (an integer) as a parameter.
         - Use conditional statements (if, else if, else) to determine the action to perform based on the choice:
            - If the choice is 1, call a helper method (greetUser()) to display a greeting message.
            - If the choice is 2, call a helper method (checkEvenOrOdd()) to get an integer input from the user and check if it's even or odd.
            - If the choice is 3, print an exit message and terminate the program.
            - If the choice is invalid, print an error message.

   3. Helper Methods (Optional, but Recommended)
      - greetUser()
         - Purpose: To display a greeting message to the user.
      - checkEvenOrOdd()
         - Purpose: To get an integer input from the user and check if it's even or odd.
         - Requirements:
            - Prompt the user to enter an integer.
            - Read the user's input.
            - Check if the number is even or odd using the modulo operator (%).
            - Print a message indicating whether the number is even or odd.

   4. Main Program Flow
      - Use a loop (e.g., while loop) to continuously display the menu and process user choices until the user chooses to exit.
      - Inside the loop:
         - Call the displayMenu() method to display the menu.
         - Get the user's choice.
         - Call the handleMenuChoice() method to process the choice.

   **Conclusion**
   By completing this coding challenge, you will gain experience in:
   - Designing and implementing methods in Java.
   - Using conditional statements for decision-making.
   - Creating a menu-driven program.
   - Handling user input.
   - Following Java programming best practices for clean and maintainable code.

### **Step 4: Push Changes to GitHub**
Once you've completed your changes, follow these steps to upload your work to your GitHub repository.

1. Check the status of your changes:
   Open the terminal and run:
   
   ```bash
   git status
   ```
   This command shows any modified or new files.
   
2. Stage the changes:
   Add all modified files to staging:
   
   ```bash
   git add .
   ```
   
3. Commit your changes:
   Write a meaningful commit message:
   
   ```bash
   git commit -m "Submitting OBJPROG Week 05 - Laboratory # 20"
   ```
   
4. Push your changes to GitHub:
   Upload your changes to your remote repository:
   
   ```bash
   git push origin main
   ```
