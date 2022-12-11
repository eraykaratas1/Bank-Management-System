
package proje3;

/**
 *
 * @author Mehmet Ali
 */
public class Faiz {
        private String ınterest;
    private String overdue_ınterest;

    public Faiz(String ınterest, String overdue_ınterest) {
        this.ınterest = ınterest;
        this.overdue_ınterest = overdue_ınterest;
    }

    public String getInterest() {
        return ınterest;
    }

    public void setInterest(String ınterest) {
        this.ınterest = ınterest;
    }

    public String getOverdue_ınterest() {
        return overdue_ınterest;
    }

    public void setOverdue_ınterest(String overdue_ınterest) {
        this.overdue_ınterest = overdue_ınterest;
    }
    
    
    
    
}
