
public class HeadFirstAndroid {


	/*Layouts:
	    A layout defines the apps appearance
	    layouts a. Layouts are usually defined in
	    XML, and can include GUI components such
	    as buttons, text fields, and labels.
	
	
	Activities:
	   activities define what an app does  
	   by using one or more activity, An activity is a special Java
	   class that decides which layout to use and
	   tells the app how to respond to the user. As
	   an example, if a layout includes a button, you
	   need to write Java code in the activity to define 
	   what the button should do when you press it.
	   
	  ---------------------------------------------------------------------------------- 
	   
	   //Activitys and Layouts
	   
	   1.The device launches
		your app and creates
		an activity object.
		
		2.The activity object
		specifies a layout.
		
		3.The activity tells
		Android to display the
		layout onscreen.
		
		4.The user interacts
		with the layout that’s
		displayed on the device.
		
		5.The activity responds
		to these interactions by
		running application code.
		
		6.The activity updates
		the display
		
		7.which the user sees
		on the device.

		----------------------------------------------------------------------------------
		
		
		Within the R class is a subclass named layout, which contains the layout resources, including the views that make up
		the user interface. Most apps will need to implement interaction between the code and these views, for example
        when reading the value entered into the EditText view or changing the content displayed on a TextView.
        Prior to the introduction of Android Studio 3.6, the only option for gaining access to a view from within the
        app code involved writing code to manually find a view based on its id via a method named findViewById(). For
        example:
        TextView exampleView = findViewById(R.id.exampleView);
        With the reference obtained, the properties of the view can then be accessed. For example:
        exampleView.setText("Hello");

	*/



}
