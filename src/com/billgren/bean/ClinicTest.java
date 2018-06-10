package com.billgren.bean;

public class ClinicTest {
	
	private int clinicNO;
	private long barcode;
	private int patientId;
	private String patientName;
	private String dob;
	private String gender;
	private String collectionDate;
	private String collectionTime;
	private String testcode;
	private String testName;
	private String result;
	private String unit;
	private double refRangeLow;
	private double refRangeHigh;
	private String note;
	private String nonSpecRefs;

	
	public ClinicTest(String ... value) {
		
		clinicNO = Integer.parseInt(value[0]);
		barcode = Long.parseLong((value[1]));
		patientId = Integer.parseInt(value[2]);
		patientName = value[3];
		dob = value[4];
		gender = value[5];
		collectionDate = value[6];
		collectionTime = value[7];
		testcode = value[8];
		testName = value[9];
		result = value[10];
		unit = value[11];
		try {
			refRangeLow = Double.parseDouble(value[12]);
			refRangeHigh = Double.parseDouble(value[13]);
		}
		catch (Exception e) {
			refRangeLow = 0.0d;
			refRangeHigh = 0.0d;
		}
		note = value[14];
		nonSpecRefs = value[15];

	}
	
	public int getClinicNO() {
		return clinicNO;
	}
	public void setClinicNO(int clinicNO) {
		this.clinicNO = clinicNO;
	}
	public long getBarcode() {
		return barcode;
	}
	public void setBarcode(long barcode) {
		this.barcode = barcode;
	}
	public int getPatientId() {
		return patientId;
	}
	public void setPatientId(int patientId) {
		this.patientId = patientId;
	}
	public String getPatientName() {
		return patientName;
	}
	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getCollectionDate() {
		return collectionDate;
	}
	public void setCollectionDate(String collectionDate) {
		this.collectionDate = collectionDate;
	}
	public String getCollectionTime() {
		return collectionTime;
	}
	public void setCollectionTime(String collectionTime) {
		this.collectionTime = collectionTime;
	}
	public String getTestcode() {
		return testcode;
	}
	public void setTestcode(String testcode) {
		this.testcode = testcode;
	}
	public String getTestName() {
		return testName;
	}
	public void setTestName(String testName) {
		this.testName = testName;
	}
	public String getResult() {
		return result;
	}
	public void setResult(String result) {
		this.result = result;
	}
	public String getUnit() {
		return unit;
	}
	public void setUnit(String unit) {
		this.unit = unit;
	}
	public double getRefRangeLow() {
		return refRangeLow;
	}
	public void setRefRangeLow(double refRangeLow) {
		this.refRangeLow = refRangeLow;
	}
	public double getRefRangeHigh() {
		return refRangeHigh;
	}
	public void setRefRangeHigh(double refRangeHigh) {
		this.refRangeHigh = refRangeHigh;
	}
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}
	public String getNonSpecRefs() {
		return nonSpecRefs;
	}
	public void setNonSpecRefs(String nonSpecRefs) {
		this.nonSpecRefs = nonSpecRefs;
	}
	
	@Override
	public String toString() {
		return "ClinicTest [clinicNO=" + clinicNO + ", barcode=" + barcode + ", patientId=" + patientId
				+ ", patientName=" + patientName + ", dob=" + dob + ", gender=" + gender + ", collectionDate="
				+ collectionDate + ", collectionTime=" + collectionTime + ", testcode=" + testcode + ", testName="
				+ testName + ", result=" + result + ", unit=" + unit + ", refRangeLow=" + refRangeLow
				+ ", refRangeHigh=" + refRangeHigh + ", note=" + note + ", nonSpecRefs=" + nonSpecRefs + "]";
	}
	
	

}
