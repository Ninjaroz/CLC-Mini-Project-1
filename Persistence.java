/**
 * EXAMPLE 1: 
 * Creates a Externalizable bean
 * Complete control over beans serialization must include a readExternal and writeExternal method.
 */
public class Persistence1 implements java.io.Externalizable {
	//class variables
	private static final long serialVersionUID = 1L;
	private transient int totalWords;
	private int totalCharacters;
    private int totalNumbers;
	private String textFile = "C:/Users/Gary/workspace/ReadTextFile/RandomFile.txt";
	@Override
	public void writeExternal(ObjectOutput out) throws IOException {		
	}
	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {		
	}
}
/**
 * EXAMPLE 2: 
 * Creates a Transient modifer in bean
 * Excludes the totalWords variable from serialization
 */
public class Persistence2 implements java.io.Serializable {
	//class variables
	private static final long serialVersionUID = 1L;
	private transient int totalWords;
	private int totalCharacters;
    private int totalNumbers;
	private String textFile = "C:/Users/Gary/workspace/ReadTextFile/RandomFile.txt";
}
/**
 * EXAMPLE 3: 
 * Creates a Serializable bean
 * All fields with the exception of static and transient fields are serialized
 */
public class Persistence3 implements java.io.Serializable {
	//class variables
	private static final long serialVersionUID = 1L;
	private int totalWords;
	private int totalCharacters;
    private int totalNumbers;
	private String textFile = "C:/Users/Gary/workspace/ReadTextFile/RandomFile.txt";
}