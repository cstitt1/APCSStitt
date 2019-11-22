package p5_14;

public class UnitConverter {
	private final double IN_TO_CM = 2.54;
	private String startUnit, endUnit;
	private final String metric = "mmcmm~km", american = "inftmi";
	
	public UnitConverter(String unit1,String unit2) {
		startUnit=unit1;
		endUnit=unit2;
		if (unit2.equals("m")) {
			endUnit += "~";
		}
		
		if (unit1.equals("m")) {
			startUnit += "~";
		}
	}
	
	public String Convert(double startVal) {
		String res = "";
		
		if ((metric.contains(startUnit) && metric.contains(endUnit))) {
			res = this.metricConvert(startVal);
		} else if (american.contains(startUnit)&&american.contains(endUnit)) {
			res = this.amerConvert(startVal);
		}
		
		if (metric.contains(startUnit) && american.contains(endUnit)) {
			if (startUnit.equals("km")) {
				startVal *= (1000*100);
			} else if (startUnit.equals("m~")) {
				startVal *= 100;
			} else if (startUnit.equals("mm")) {
				startVal/=10;
			}
			startVal/=this.IN_TO_CM;
			if (endUnit.equals("in")) {
				res = startVal + " in";
			} else if (endUnit.equals("ft")) {
				res = (startVal/12) + " ft";
			} else {
				res = (startVal/63360) + " mi";
			}
		} else if (metric.contains(endUnit) && american.contains(startUnit)) {
			if (startUnit.equals("mi")) {
				startVal *= (63360);
			} else if (startUnit.equals("ft")) {
				startVal *= 12;
			}
			startVal*=this.IN_TO_CM;
			if (endUnit.equals("cm")) {
				res = startVal + " cm";
			} else if (endUnit.equals("km")) {
				res = (startVal/(1000*100)) + " km";
			} else if (endUnit.equals("m~")){
				res = (startVal/100) + " m";
			} else if (endUnit.equals("mm")) {
				res = (startVal*10) + " mm";
			}
		}
		return res;
	}
	
	private String amerConvert(double startVal) {
		if (startUnit.equals("in")) {
			if (endUnit.equals("in")) {
				return startVal + " "+endUnit;
			} else if (endUnit.equals("ft")) {
				return startVal/12 + " "+endUnit;
			} else if (endUnit.equals("mi")) {
				return startVal/63360 + " "+endUnit;
			}
		} else if (startUnit.equals("ft")) {
			if (endUnit.equals("in")) {
				return startVal*12 + " "+endUnit;
			} else if (endUnit.equals("ft")) {
				return startVal + " "+endUnit;
			} else if (endUnit.equals("mi")) {
				return startVal*12/63360 + " "+endUnit;
			}
		} else if (startUnit.equals("mi")) {
			if (endUnit.equals("in")) {
				return startVal*63360 + " "+endUnit;
			} else if (endUnit.equals("ft")) {
				return startVal*63360/12 + " "+endUnit;
			} else if (endUnit.equals("mi")) {
				return startVal + " "+endUnit;
			}
		}
		return null;
	}
	
	private String metricConvert(double startVal) {
		if (startUnit.equals("km")) {
			if (endUnit.equals("km")) {
				return startVal + " "+endUnit;
			} else if (endUnit.equals("m~")) {
				return startVal*1000 + " m";
			} else if (endUnit.equals("mm")) {
				return startVal*(1000*1000) + " "+endUnit;
			} else if (endUnit.equals("cm")) {
				return startVal*(1000*100) + " "+endUnit;
			}
		} else if (startUnit.equals("m~")) {
			if (endUnit.equals("km")) {
				return startVal/1000 + " "+endUnit;
			} else if (endUnit.equals("m~")) {
				return startVal + " m";
			} else if (endUnit.equals("mm")) {
				return startVal*1000 + " "+endUnit;
			} else if (endUnit.equals("cm")) {
				return startVal*100 + " "+endUnit;
			}
		} else if (startUnit.equals("mm")) {
			if (endUnit.equals("km")) {
				return startVal/(1000*1000) + " "+endUnit;
			} else if (endUnit.equals("m~")) {
				return startVal/1000 + " m";
			} else if (endUnit.equals("mm")) {
				return startVal + " "+endUnit;
			} else if (endUnit.equals("cm")) {
				return startVal/10 + " "+endUnit;
			}
		} else if (startUnit.equals("cm")) {
			if (endUnit.equals("km")) {
				return startVal/(1000*100) + " "+endUnit;
			} else if (endUnit.equals("m~")) {
				return startVal/100 + " m";
			} else if (endUnit.equals("mm")) {
				return startVal*10 + " "+endUnit;
			} else if (endUnit.equals("cm")) {
				return startVal + " "+endUnit;
			}
		}
		return null;
	}
}
