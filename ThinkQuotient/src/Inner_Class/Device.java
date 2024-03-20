package Inner_Class;
//interface implementor
public class Device {
	
	Swichable obj=new Swichable()
			{

				@Override
				public void on() {
					// TODO Auto-generated method stub
					System.out.println(" Device on");
				}

				@Override
				public void off() {
					// TODO Auto-generated method stub
					System.out.println("Device Off");
				}
				
			};
			
			public void play(Swichable obj)
			{
				obj.on();
				obj.off();
			}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Device d=new Device();
		d.obj.on();
		d.obj.off();
		
		d.play(new Swichable() {	// method argument inner class

			@Override
			public void on() {
				// TODO Auto-generated method stub
				System.out.println("i m in play on");
			}

			@Override
			public void off() {
				// TODO Auto-generated method stub
				System.out.println("i m in play Off");
			}		
		});
	}

}
