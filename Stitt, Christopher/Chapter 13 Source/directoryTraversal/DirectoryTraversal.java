package directoryTraversal;

import java.io.File;

public class DirectoryTraversal
{
    public static void main(String[] args)
    {
        printFileNames(new File("/Users/cstitt/Desktop"), 2);
    }
    
    public static void printFileNames(File f, int maxLevels)
    {
    	if (maxLevels == 0) {
        	return;
        }
    	
    	if (f.isFile()) {
    		System.out.println(f.getAbsolutePath());
    	}
        
        if (f.isDirectory()) {
        	File[] nextLevel = f.listFiles();
        	for (int i=0; i<nextLevel.length; i++) {
        		printFileNames(nextLevel[i], maxLevels-1);
        	}
        }
    }
}
