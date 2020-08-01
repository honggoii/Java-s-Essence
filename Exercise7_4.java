class MyTv2 {
	private boolean isPowerOn;
	private int channel;
	private int preChannel;
	private int volume;
	
	final int MAX_VOLUME = 100;
	final int MIN_VOLUME = 0;
	final int MAX_CHANNEL = 100;
	final int MIN_CHANNEL = 1;
	
	public boolean getPower() { return isPowerOn; }
	public int getChannel() { return channel; }
	public int getVolume() { return volume; }
	
	public void setPower(boolean isPowerOn) {
		this.isPowerOn = isPowerOn;
	}
	public void setChannel(int channel) {
		if (MIN_CHANNEL <= channel && channel <= MAX_CHANNEL) {
			preChannel = this.channel;
			this.channel = channel;
		}			
	}
	public void setVolume(int volume) {
		if (MIN_VOLUME <= volume && volume <= MAX_VOLUME)
			this.volume = volume;
	}
	
	public void gotoPrevChannel() {
		setChannel(preChannel);
	}
}

public class Exercise7_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyTv2 t = new MyTv2();
		
		t.setChannel(10);
		System.out.println("CH:" + t.getChannel());
		t.setChannel(20);
		System.out.println("CH:" + t.getChannel());
		t.gotoPrevChannel();
		System.out.println("CH:" + t.getChannel());
		t.gotoPrevChannel();
		System.out.println("CH:" + t.getChannel());
	}

}
