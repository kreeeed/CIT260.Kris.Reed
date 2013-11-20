/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package zombieland;

/**
 *
 * @author K-Reed
 */
public abstract class SuperAreaView {
    private String[][] menuItems;
    
    public SuperAreaView(String[][] menuItems){
  this.menuItems = menuItems;                  
    }
    protected abstract String getCommand();
}




