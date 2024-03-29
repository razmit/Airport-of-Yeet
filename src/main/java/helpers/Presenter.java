package helpers;

import helpers.classes.ReadExcel;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.json.JSONArray;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Presenter {
    public Presenter() { }

    public void mainGreeter()  {
        System.out.println("""
                __          __  _                            _          _   _         \s
                \\ \\        / / | |                          | |        | | | |        \s
                 \\ \\  /\\  / /__| | ___ ___  _ __ ___   ___  | |_ ___   | |_| |__   ___\s
                  \\ \\/  \\/ / _ \\ |/ __/ _ \\| '_ ` _ \\ / _ \\ | __/ _ \\  | __| '_ \\ / _ \\
                   \\  /\\  /  __/ | (_| (_) | | | | | |  __/ | || (_) | | |_| | | |  __/
                    \\/  \\/ \\___|_|\\___\\___/|_| |_| |_|\\___|  \\__\\___/   \\__|_| |_|\\___|
                                                                                      \s
                                                                                      \s""");

        System.out.println("""
                   _  _                    _                       _            __  __     __       _             _  _  \s
                 _| || |_            /\\   (_)                     | |          / _| \\ \\   / /      | |          _| || |_\s
                |_  __  _|_____     /  \\   _ _ __ _ __   ___  _ __| |_    ___ | |_   \\ \\_/ /__  ___| |_   _____|_  __  _|
                 _| || ||______|   / /\\ \\ | | '__| '_ \\ / _ \\| '__| __|  / _ \\|  _|   \\   / _ \\/ _ \\ __| |______|| || |_\s
                |_  __  _|        / ____ \\| | |  | |_) | (_) | |  | |_  | (_) | |      | |  __/  __/ |_        |_  __  _|
                  |_||_|         /_/    \\_\\_|_|  | .__/ \\___/|_|   \\__|  \\___/|_|      |_|\\___|\\___|\\__|         |_||_| \s
                                                 | |                                                                    \s
                                                 |_|                                                                    \s""");

        System.out.println("""
                                                                   _  _                                                  \s
                                                                 _| || |_                                                \s
                 ______ ______ ______ ______ ______ ______ _____|_  __  _|_____ ______ ______ ______ ______ ______ ______\s
                |______|______|______|______|______|______|______|| || ||______|______|______|______|______|______|______|
                                                                |_  __  _|                                               \s
                                                                  |_||_|                                                 \s
                                                                                                                         \s""");
    }

    public void mainMenu() {
        System.out.println(
                """
                        ┌---------- What are we doing today? ----------┐
                        | ■ Go to Flights menu                     (1) |
                        | ■ Go to Aircraft menu                    (2) |
                        | ■ Go to Airlines menu                    (3) |
                        | ■ Import flights                         (4) |
                        | ■ Export flights                         (5) |
                        | ■ Check the weather                      (6) |
                        | ■ Exit the application                   (7) |
                        └------ Please enter a number to continue -----┘"""
        );
    }

    public void farewellMessage(){
        System.out.println(
                """
                ┌----------┐
                | Goodbye! |
                └----------┘
                """);
    }

//region SECTION ABOUT FLIGHTS

//      ADD

    public void flightsMenu(){
        System.out.println(
                """
                ┌---------------- Flights menu ----------------┐
                | ■ Add a new flight                       (1) |
                | ■ Update status of a flight              (2) |
                | ■ Information about a flight             (3) |
                | ■ Cancel a flight                        (4) |
                | ■ Go back                                (5) |
                └------ Please enter a number to continue -----┘
                """);
    }

    public void flightsMenuAddOrigin(){
        System.out.println(
                """
                ┌-------------- Add a new flight --------------┐
                | ■ Enter the place of origin                  |
                └--- Write data and press Enter to continue ---┘
                """);
    }

    public void flightsMenuAddDest(){
        System.out.println(
                """
                ┌-------------- Add a new flight --------------┐
                | ■ Enter the place of destination             |
                └--- Write data and press Enter to continue ---┘
                """);
    }

    public void flightsMenuAddDateDep(){
        System.out.println(
                """
                ┌-------------- Add a new flight --------------┐
                | ■ Enter the date of departure (MM/DD/YYYY)   |
                └--- Write data and press Enter to continue ---┘
                """);
    }

    public void flightsMenuAddDateArri(){
        System.out.println(
                """
                ┌-------------- Add a new flight --------------┐
                | ■ Enter the date of arrival (MM/DD/YYYY)     |
                └--- Write data and press Enter to continue ---┘
                """);
    }

    public void flightsMenuAddTimeDep(){
        System.out.println(
                """
                ┌-------------- Add a new flight --------------┐
                | ■ Enter the time of departure (AM/PM format) |
                └--- Write data and press Enter to continue ---┘
                """);
    }

    public void flightsMenuAddTimeArri(){
        System.out.println(
                """
                ┌-------------- Add a new flight --------------┐
                | ■ Enter the time of arrival (AM/PM format)   |
                └--- Write data and press Enter to continue ---┘
                """);
    }

    public void flightsMenuAddNameAirc(){
        System.out.println(
                """
                ┌-------------- Add a new flight --------------┐
                | ■ Enter the name of the aircraft             |
                └--- Write data and press Enter to continue ---┘
                """);
    }

    public void flightsMenuAddNameAirpo(){
        System.out.println(
                """
                ┌-------------- Add a new flight --------------┐
                | ■ Enter the time of arrival (AM/PM format)   |
                └--- Write data and press Enter to continue ---┘
                """);
    }

//      UPDATE

    public void flightsMenuUpdateChooseFlight(){
        System.out.println(
                """
                ┌-------------- Update a flight ---------------┐
                | ■ Enter the ID of the flight to update       |
                └--- Write data and press Enter to continue ---┘
                """);
    }

    public void flightsMenuUpdateStatus(){
        System.out.println(
                """
                ┌-------------- Update a flight ---------------┐
                | ■ Enter the new state of the chosen flight   |
                └--- Write data and press Enter to continue ---┘
                """);
    }

//endregion SECTION ABOUT FLIGHTS
//region SECTON ABOUT AIRLINES
    public void airlinesMenu(){
        System.out.println(
                """
                ┌--------------- Airlines menu ----------------┐
                | ■ Add a new airline                      (1) |
                | ■ Update an airline                      (2) |
                | ■ Delete an airline                      (3) |
                | ■ View all airlines                      (4) |
                | ■ Go back                                (5) |
                └------ Please enter a number to continue -----┘
                """);
    }

    public void showAirlines(JSONArray results){

//        Aesthetic formatting
        String listAir = "┌----------------- Registered Airlines ------------------┐\n";

        for (int i = 0; i <results.length(); i++) {
            listAir = listAir.concat(
                    "| Airline name: "+results.getJSONObject(i).getString("name") + "\n"
                    + "| Country where the airline is registered: " + results.getJSONObject(i).getString("countryRegistration") + "\n"
                    + "├--------------------------------------------------------┤\n"
            );
        }
        listAir = listAir.concat("└------------- Please press Enter to continue -----------┘\n");
        System.out.println(listAir);
    }

    public void airlinesMenuAddName(){
        System.out.println(
                """
                ┌-------------- Add a new airline -------------┐
                | ■ Enter the airline's name                   |
                └--- Write data and press Enter to continue ---┘
                """);
    }

    public void airlinesMenuAddCountryOri(){
        System.out.println(
                """
                ┌-------------- Add a new airline -------------┐
                | ■ Enter the airline's country of origin      |
                └--- Write data and press Enter to continue ---┘
                """);
    }

    public void airlinesMenuUpdateSearch(){
        System.out.println(
                """
                ┌-------------- Update an airline -------------┐
                | ■ Enter the name of the airline to update    |
                └--- Write data and press Enter to continue ---┘
                """);
    }

    public void airlinesMenuUpdateName(String find){
        System.out.printf(
                """
                ┌-------------- Update an airline -------------┐
                | ► %s                                         |
                | ■ Enter airline's new name                   |
                └--- Write data and press Enter to continue ---┘
                """, find);
    }

    public void airlinesMenuUpdateOri(String find){
        System.out.printf(
                """
                ┌-------------- Update an airline -------------┐
                | ► %s                                         |
                | ■ Enter airline's new country of origin      |
                └--- Write data and press Enter to continue ---┘
                """, find);
    }
    public void airlinesMenuDelete(){
        System.out.println(
                """
                ┌-------------- Delete an airline -------------┐
                | ■ Enter the name of the airline to delete    |
                └--- Write data and press Enter to continue ---┘
                """);
    }

//endregion ENDS SECTION ABOUT AIRLINES

    //Region section about Aircraft

    public void aircraftMenu(){
        System.out.println(
                """
                ┌---------------- Aircraft menu ---------------┐
                | ■ Add a new Aircraft                     (1) |
                | ■ Delete an Aircraft                     (2) |
                | ■ Information about Aircraft             (3) |
                | ■ Update an Aircraft                     (4) |
                └------ Please enter a number to continue -----┘
                """);
    }

    //ADD
    public void aircraftMenuAddType(){
        System.out.println(
                """
                ┌------------- Add a new Aircraft -------------┐
                | ■ Enter the type of the Aircraft             |
                └--- Write data and press Enter to continue ---┘
                """);
    }

    public void aircraftMenuAddName(){
        System.out.println(
                """
                ┌------------- Add a new Aircraft -------------┐
                | ■ Enter the name of the Aircraft             |
                └--- Write data and press Enter to continue ---┘
                """);
    }

    public void aircraftMenuAddModel(){
        System.out.println(
                """
                ┌------------- Add a new Aircraft -------------┐
                | ■ Enter the model of the Aircraft            |
                └--- Write data and press Enter to continue ---┘
                """);
    }

    public void aircraftMenuAddCapacity(){
        System.out.println(
                """
                ┌------------- Add a new Aircraft -------------┐
                | ■ Enter the passengers capacity              |
                └--- Write data and press Enter to continue ---┘
                """);
    }

    public void aircraftMenuAddRange(){
        System.out.println(
                """
                ┌------------- Add a new Aircraft -------------┐
                | ■ Enter the range of the Aircraft            |
                └--- Write data and press Enter to continue ---┘
                """);
    }

    public void aircraftMenuAddAirlineName(){
        System.out.println(
                """
                ┌------------------ Add a new Aircraft ------------------┐
                | ■ Enter the name of the Airline that owns the aircraft |
                └-------- Write data and press Enter to continue --------┘
                """);
    }

    public void aircraftMenuAddAirlineAllowed(){
        System.out.println(
                """
                ┌------------------ Add a new Aircraft ------------------┐
                | ■ Is this type of aircraft allowed at the airport?     |
                └-------- Write data and press Enter to continue --------┘
                """);
    }

    //DELETE
    public void aircraftMenuDeleteAircraft(){
        System.out.println(
                """
                ┌-------------- Delete an aircraft -------------┐
                | ■ Enter the name of the aircraft to delete   |
                └--- Write data and press Enter to continue ---┘
                """);
    }

    public void showAircraft(JSONArray results){

//        Aesthetic formatting
        String listAir = "┌----------------- Registered Aircraft ------------------┐\n";

        for (int i = 0; i <results.length(); i++) {
            listAir = listAir.concat(
                    "| Aircraft name: "+results.getJSONObject(i).getString("name") + "\n"
                            + "| Type of aircraft: " + results.getJSONObject(i).getString("type") + "\n"
                            + "| Model of aircraft: " + results.getJSONObject(i).getString("model") + "\n"
                            + "| Capacity: " + results.getJSONObject(i).getInt("capacity") + " passengers\n"
                            + "| Range: " + results.getJSONObject(i).getString("range") + " Km.\n"
                            + "| Airline: " + results.getJSONObject(i).getString("nameAirline") + "\n"
                            + "| Allowed at the airport: " + (1 == results.getJSONObject(i).getInt("typeAllowed") ? "Yes" : "No") + "\n"
                            + "├--------------------------------------------------------┤\n"
            );
        }
        listAir = listAir.concat("└------------- Please press Enter to continue -----------┘\n");
        System.out.println(listAir);
    }

//    Search for aircraft's name
    public void aircraftMenuUpdateSearch(){
        System.out.println(
                """
                ┌-------------- Update an aircraft ------------┐
                | ■ Enter the name of the aircraft to update   |
                └--- Write data and press Enter to continue ---┘
                """);
    }

    public void aircraftMenuUpdateType(String find){
        System.out.printf(
                """
                ┌-------------- Update an airline -------------┐
                | ► %s                                         |
                | ■ Enter aircraft's new type                  |
                └--- Write data and press Enter to continue ---┘
                """, find);
    }

    public void aircraftMenuUpdateName(String find){
        System.out.printf(
                """
                ┌-------------- Update an airline -------------┐
                | ► %s                                         |
                | ■ Enter aircraft's new name                  |
                └--- Write data and press Enter to continue ---┘
                """, find);
    }

    public void aircraftMenuUpdateModel(String find){
        System.out.printf(
                """
                ┌-------------- Update an airline -------------┐
                | ► %s                                         |
                | ■ Enter aircraft's new model                 |
                └--- Write data and press Enter to continue ---┘
                """, find);
    }

    public void aircraftMenuUpdateCapacity(String find){
        System.out.printf(
                """
                ┌-------------- Update an airline -------------┐
                | ► %s                                         |
                | ■ Enter aircraft's new capacity              |
                └--- Write data and press Enter to continue ---┘
                """, find);
    }

    public void aircraftMenuUpdateRange(String find){
        System.out.printf(
                """
                ┌-------------- Update an airline -------------┐
                | ► %s                                         |
                | ■ Enter aircraft's new range                 |
                └--- Write data and press Enter to continue ---┘
                """, find);
    }

    public void aircraftMenuUpdateAirline(String find){
        System.out.printf(
                """
                ┌-------------- Update an airline -------------┐
                | ► %s                                         |
                | ■ Enter aircraft's new parent airline        |
                └--- Write data and press Enter to continue ---┘
                """, find);
    }

    public void aircraftMenuUpdateAllowed(String find){
        System.out.printf(
                """
                ┌-------------- Update an airline -------------┐
                | ► %s                                         |
                | ■ Is the aircraft allowed at the airport?    |
                └--- Write data and press Enter to continue ---┘
                """, find);
    }

//End of Aircraft Region

//Excel file

}