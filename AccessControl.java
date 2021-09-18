
public class AccessControl {
	
	private FolderCommand fcmd;

	public AccessControl(FolderCommand foldercmd) {
		fcmd = foldercmd;
	}

	public FolderCommand getFcmd() {
		return fcmd;
	}

	public void setFcmd(FolderCommand fcmd) {
		this.fcmd = fcmd;
	}

	
	public void onclick() {
		fcmd.execute();
	}
	
	
}
