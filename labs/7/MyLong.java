package lab7;

public class MyLong {

private long value;

public MyLong (Long vaule) {
	this.value=value;
}
	public Long getValue() {
		return value;
	}
		public boolean isEven() {
			if (value%2==0)
				return true;
			else
				return false;
		}
			public boolean isOdd() {
				if (value%2==0)
					return true;
				else
					return false;
			}
				public boolean isPrime() {
					for (int k=2; k<value; k++) {
						if (value %k ==0)
							return false;
					return true;
					}
					return false;
				}	
					static boolean isEven(MyLong value) {
						return value.isEven();
						}
							boolean equals(long value) {
								return this.value==value;
							}

						
				}
				


