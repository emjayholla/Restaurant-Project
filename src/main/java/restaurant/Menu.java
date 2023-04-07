package restaurant;

import java.util.Calendar;
import java.util.ArrayList;
import java.util.Date;

public class Menu {
    private ArrayList<MenuItem> genericMenu = new ArrayList<>();
    private Date lastUpdated;

        public void addItem() {
            genericMenu.add(new MenuItem("French Fries", "The best things ever.", "Sides", 2.49, true));
        }
        public void removeItem(MenuItem menuItemToBeRemoved) {

        }

        public boolean isNewItem(MenuItem item) {
            return false;
        }

        public void updatedDate() {

        }

        public void printMenu() {
            for(int x = 0; x < genericMenu.size(); x++){
                System.out.println(genericMenu.get(x).getName());
                System.out.println(genericMenu.get(x).getDescription());
                System.out.println(genericMenu.get(x).getCategory());
                System.out.println(genericMenu.get(x).getPrice());
            }
        }

        public void singleMenu (MenuItem item) {

        }

//        public ArrayList<MenuItem> getMenuItems() {
////            return menuItems;
//        }

        public void setMenuItems(ArrayList<MenuItem> menuItems) {
//            this.menuItems = menuItems;
        }

        public Date getLastUpdated() {
            return lastUpdated;
        }

        public void setLastUpdated(Date lastUpdated) {
            this.lastUpdated = lastUpdated;
        }
    }