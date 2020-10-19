# MAD - Level 1: Task 2

This Mobile Application is developed as part of the introduction to the Mobile Application Development Course at HvA.

Users can fill in the answers to the conjunctions of the `truth (T)` or `false (f)` statements in the input fields.  
After pressing the `submit` button, the user receives feedback about how many correct answers were given.

## Level 1 Questions

1.	What are the names of the latest three versions of Android?
-	Android 10, or Android Q,
-	Android 9, or Android Pie or Android P,
-	Android 8.1.0, or Android Oreo or Android O

2.	What does the abbreviation ART stand for?  
ART stands for Android runtime, which revers to the managed runtime used by applications and some system services on Android.

3.	What is Android Jetpack?  
Android Jetpack is a suite of libraries to help developers follow best practices, reduce boilerplate code, and write code that works consistently across Android versions and devices so that developers can focus on the code they care about.

4.	Describe the difference between the fixed, wrap_content and match_constraint setting of the constraint layout?  
A fixed layout means a programmer hardcodes the width / height of a widget, wrap_content means the width / height are determined by the contents of a widget and match_constraint means that a widget can use available, or left over, width or height according to its constraints.

5.	What does the abbreviation DP stand for and why do we need them?  
DP, or DiP, stands for Density-independent Pixels. They’re an abstract unit that is based on the physical density of the screen, relative to a 160-dpi screen. Meaning 1 DP equals 1 pixal on a 160-dpi screen. The ratio of DP-to-pixel will change with the screen density, but not necessarily in direct proportion.

6.	What is the purpose of the string.xml file?  
The purpose of the `string.xml` file is to provide references for string variables that can be accessed both by the view ánd the model.

7.	Why is the layout in Android specified by .xml files?  Why not just have the layout in the code (Kotlin or Java)?  
XML is used to create the view of an applicated. It is preprocessed and does not change on its own accord. It’s simple to use and can be used to achieve a `Model-View-Controller` programming strategy.

8.	What kind of information can be found in the manifest file?  
The manifest file describes essential information about an application to the Android build tools, the Android operating system, and Google Play. It must hold information about:
-	The application’s package name,
-	The components of the application, including all activities, services, broadcast receivers, and content providers,
-	Permissions that the application would need, but also permissions other apps need to have in order to access data from another application,
-	Any hard- and software features that the application needs.

9.	What is the purpose of view binding in Android?  
This is done so that the developer can access widgets with an ID in the view and manipulate them.
