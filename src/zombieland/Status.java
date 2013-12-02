/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package zombieland;

/**
 *
 * @author K-Reed
 */
public enum Status {
    NEW_GAME ("NEW_GAME"),
    QUIT ("QUIT"),
    EXIT ("EXIT");
    
    String value;
    
    Status(String value) {
        this.value = value;
    }
    
    public String getValue() {
        return value;
    }
    
}
