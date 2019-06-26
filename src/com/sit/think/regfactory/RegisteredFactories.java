package com.sit.think.regfactory;
import java.util.*;

/**  
 * @author   E-mail:   
 * @version 2018年6月2日 下午6:26:08  
 * 在本例中，Filter和Belt只是分类标识，因此不能创建它们的实例，而只应该创建它们子类的实例。
 */
class Part{
	public String toString(){
		return getClass().getSimpleName();
	}
	static List<Factory<? extends Part>> partFactories = 
			new ArrayList<Factory<? extends Part>>();
	static {
		partFactories.add(new FuelFilter.Factory());
		partFactories.add(new AirFilter.Factory());
		partFactories.add(new CabinAirFilter.Factory());
		partFactories.add(new OilFilter.Factory());
		partFactories.add(new FanBelt.Factory());
	}
	private static Random rand = new Random(47);
	public static Part createRandom(){
		int n = rand.nextInt(partFactories.size());
		return partFactories.get(n).create();
	}
}
class Filter extends Part{}
class FuelFilter extends Filter{
	public static class Factory
	implements com.sit.think.regfactory.Factory<FuelFilter>{
		public FuelFilter create(){
			return new FuelFilter();
		}
	}
}
class AirFilter extends Filter{
	public static class Factory
	implements com.sit.think.regfactory.Factory<AirFilter>{
		public AirFilter create(){
			return new AirFilter();
		}
	}
}
class CabinAirFilter extends Filter{
	public static class Factory
	implements com.sit.think.regfactory.Factory<CabinAirFilter>{
		public CabinAirFilter create(){
			return new CabinAirFilter();
		}
	}
}
class OilFilter extends Filter{
	public static class Factory
	implements com.sit.think.regfactory.Factory<OilFilter>{
		public OilFilter create(){
			return new OilFilter();
		}
	}
}
 
class Belt extends Part{}
class FanBelt extends Belt{
	public static class Factory
	implements com.sit.think.regfactory.Factory<FanBelt>{
		public FanBelt create(){
			return new FanBelt();
		}
	}
}
 
public class RegisteredFactories {
	public static void main(String[] args) {
		for(int i=0;i<10;i++)
			System.out.println(Part.createRandom());
	}
 
}
