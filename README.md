# CIS454-Router-App
An App Called Router that will provide users will the option to use search parameters to generate transit routes.

The current version for the app supports bus, car, taxi, and bicycle routing from a start and end destination, with a predetermined departure time.

How to download and use the app:

1. Download the newest version of Android Studio (which utilizes the intelliJ platform)
2. Download the application file from this GitHub Respository
3. Starting the app: Open Android Studio
  3a. Open the file
  3b. You should be including the entire file, which includes the "app" as well as all associated "Gradle" files, otherwise the app cannot run.
  3c. In the top right of Android Studio, click the phone symbol, this will open the "Device Manager"
  3d. Select an Android Emulator that you wish to run, we used the newest Google Pixle Model.
  3e. Start the emulator, a phone should appear on the right hand side of your screen
  3f. "Build" the app, this is the green hammer on the top bar of the screen, next to the hammer it should say "app" with the android symbol to its right.
  3g. Once it is built (Should say "gradle build finished in _____ seconds"), click the green triangle on the hammer's right to run the app
  3h. A google android symbol should appear on the emulator, this means the app is starting
  3i. The app should now be runing
4. How to use the app:
  4a. Create an account using the "create an account feature"
  4b. Log in to the app, you may also use the continue without an account option, but features are withheld
  4c. Go to the route creation screen
    4ai. There are two ways to access this page, one is from the main menu page where it says route creation, with the train symbol and is linked or by using the bottom navigation bar which uses the same symbol.
    4aii. Once you have accessed the route creation screen you should see a google maps fragment as well as some options to choose your route parameters
    4aiii. You click on the mode of transport to select it, it will ripple blue when selected.
    4aiv. To select the start dest, CLICK AND HOLD on the maps fragment UNTIL A BLUE MARKER APPEARS, you have to click longer than you may think but only by a second. 
    4av. You can now CLICK AND HOLD to move the marker around, this will automatically be set as a destination and you will see the address.
    4avi. You can then use the "end destination" and "start/current location" to set the locations using the markers accordingly
    4avii. You can also click the reset red markers for some locations thta have been hardcoded into the map.
    4aviii. Once your location are set (and they are viable travel destinations, not in the middle of the Atlantic, you can select a time using the button, it is intuitive as it has a wheel to select the time.
    4aix. Once all parameters are set, click the generate route button, you will then be brought to the display page to see the route with all the info you entered as well as the turn-by-turn directions
    4ax. You can then save the route or go back. If you accept it will bring you to the user profile screen where you can comment and save on the route.
  5. Extra info
    5a. Routes you create will be saved in previously seen routes, you can also save routes, and comment on routes.
    5b. You can create routes without an account, but will be unable to save or comment on them. 
