/**
 * 
 */
package fr.letzner.patterns.gof.behavioral.chainOfResponsibility;

/**
 * @author Stefan Letzner
 *
 */
public class FileLogger extends AbstractLogger {

	public FileLogger(int level){ 
		this.level = level; 
	}
	
	@Override
	protected void write(String message) {
		System.out.println("File::Logger: " + message);
	}

}
