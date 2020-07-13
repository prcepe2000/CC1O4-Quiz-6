/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package positionallistmain;

/**
 *
 * @author username
 */
public class PositionalListMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        LinkedPositionalList<String> list = new LinkedPositionalList<>();
        Position p1 = (Position) list.addFirst("position1");
        Position p2 = (Position) list.addAfter(p1, "after position 1");
        Position p3 = (Position) list.addBefore(p2, "before p2");
        Position p4 = (Position) list.addLast("last position");
        list.showPositionList();
        list.remove(p2);
        System.out.println();
        list.showPositionList();
        
        
    }
    
}
