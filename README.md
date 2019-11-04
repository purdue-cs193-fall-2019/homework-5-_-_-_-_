# CS193HW5: Git and Merge Conflicts
 
## What is this assignment
In this assignment, you will be working with a partner to navigate the use of branches and solving merge conflicts. As you learned in lecture, merge conflicts are bound to happen and rather than try to avoid them, we should learn how to manage them. Branching is another key aspect of collaboration. Your teammate and you will work on 2 seperate branches, both different from the master branch, and will implement the same 2 methods in different ways. Merge conflicts will appear, and you and your partner will both have the oppurtunity to fix them. 
 
## When is this due?
This homework will be due on Monday, 11/18.
 
## When will I know I'm done?
Advice: read the steps!!
 
You are done when you can see 3 different branches (including master), your changes and pull requests are shown in Commit History, and the 2 methods are implemented correctly in all 3 branches. We should be able to see these changes on **GitHub** and not just your terminal.
 
Keep in mind: **For us to see your work it has to be on GitHub, aka the central repository. We can't grade your work if it is just in your local repository.**

**Team Assignments: One teammate will be known as Person A, and the other will be known as Person B throughout this ReadMe. Person A does not have to read PersonB's steps and vice versa**
 
## Step 1 (Both Person A and Person B): Clone the repository. TODOs exist here
### TODO 1 
As you've done before, everything git related usually starts with a clone. Once you have created your copy of the Homework 5 repository (`homework-5-<your GitHub username>`), **run** the command `git clone https://github.com/purdue-cs193-fall-2019/homework-5-<your GitHub username>.git`. As you know, all this command does is to download a copy of the *remote* repository to your *local* machine. 
 
Now if you run `ls`, you should see a directory called `homework-5-<your GitHub username>`. `cd` into this directory and run `ls` again. You should see all the same files that GitHub shows in the browser for this repository. 
 
## Step 2 (Both Person A and Person B): Status
One of the most frequently used git commands is `git status`. Any time you are inside a git repository (i.e. your current directory or one of its parents is an initialized git repository), you can run `git status` to see precisely what state your repository is in. 
 
Make sure you are in the Homework 5 directory and try running `git status`. The output of this command tells you many things. 
 
The first line `On branch master` tells you that you are currently working from the `master` branch of the repository (more on branches later).
 
The second line `Your branch is up to date with 'origin/master'` tells you that your local repository (the files stored on your computer) are in the same state as the files stored remotely on the GitHub repository.
 
The third line `nothing to commit, working tree clean` tells you that you have not made any changes to the files in the repository at this point.

## Step 2
If you're Person A, then go here: [PersonA.md](PersonA.md)  
If you're Person B, then go here: [PersonB.md](PersonB.md)  
 
## Final Step Once Both Teammates Are Done
Make sure that there are 3 branches shown on GitHub, `master`, `PersonA`, and `PersonB`. Make sure that master has the most updated code. This means that the `basicCalculator` should be implemented with switch-cases and `printValuesAndReturnSum` should be implemented with a while loop. Finally, make sure that your commits are shown in the Commit History on GitHub. 
 
## Reminder
Please ask questions if you need them.  Reach out on Piazza, office hours, or PSOs. For grading issues on homeworks, please email one of your PSO TAs. If you email us, we will happily inform you to email your PSO TAs. Good luck :)
