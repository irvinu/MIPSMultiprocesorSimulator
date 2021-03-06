/**
 * Created by irvin on 11/9/17.
 */
public final class Constant {

    public static final String INSTRUCTION_MEMORY_TYPE = "instructionMemoryType";
    public static final String SHARED_MEMORY_TYPE = "sharedMemoryType";

    //Dictionary & Cache Tags.
    public static final int I = -1; //Invalid
    public static final int U = 0; //Uncached, used as Dictionary state only.
    public static final int M = 1; //Modified
    public static final int C = 2; //Shared in Spanish = Compartido.

    public static final int DICTIONARY_STATE = 0; //State index in the dictionary data structure.

    //Processors ids
    public static final int PROCESSOR_1 = 1;
    public static final int PROCESSOR_2 = 2;
    public static final int PROCESSOR_3 = 3;

    //Processor dictionary existence
    public static final int OFF = 0;
    public static final int ON = 1;

    //Cache Types, which implies real size.
    public static final int DATA_CACHE_TYPE = 1;
    public static final int INSTRUCTION_CACHE_TYPE = 2; //

    //The number of integers that form a word in the simulation.
    public static final int DATA_CACHE_REAL_WORD_SIZE = 1;
    public static final int INSTRUCTION_CACHE_REAL_WORD_SIZE = 4;

    public static final int NULL_BLOCK_NUMBER = -1;
    public static final int WORDS_IN_BLOCK = 4;

    public static final int[] INSTRUCTION_EMPTY_BLOCK = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
    public static final int[] DATA_EMPTY_BLOCK = {0,0,0,0};

    public static final int[] INSTRUCTION_EMPTY_WORD = {0,0,0,0};
    public static final int[] DATA_EMPTY_WORD = {0};

    public static final int NUMBER_OF_REGISTER_PER_CORE = 32;
    public static final int REGISTER_ZERO = 0;
    public static final int REGISTER_NULL_VALUE = -1;



    private Constant(){
    }
}
