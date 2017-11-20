import java.util.HashMap;

/**
 * Created by irvin on 11/12/17.
 */
public class Context {
    HashMap<String, Integer> registers;
    private int pc;
    private String idHilillo;
    private int programTime;

    public Context(HashMap<String, Integer> registers, int pc) {
        this.registers = registers;
        this.pc = pc;
    }

    public HashMap<String, Integer> getRegisters() {
        return registers;
    }

    public void setRegisters(HashMap<String, Integer> registers) {
        this.registers = registers;
    }

    public int getPc() {
        return pc;
    }

    public void setPc(int pc) {
        this.pc = pc;
    }

    public String getIdHilillo() {
        return idHilillo;
    }

    public void setIdHilillo(String idHilillo) {
        this.idHilillo = idHilillo;
    }

    public int getProgramTime() {
        return programTime;
    }

    public void setProgramTime(int programTime) {
        this.programTime = programTime;
    }
}
