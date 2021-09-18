
public class DeleteFolder implements FolderCommand{
	
	private FolderDevice fd;

	public DeleteFolder(FolderDevice fd) {
		super();
		this.fd = fd;
	}

	public FolderDevice getFd() {
		return fd;
	}

	public void setFd(FolderDevice fd) {
		this.fd = fd;
	}

	@Override
	public void execute() {
		 fd.delete();
		
	}

}
