
public class ExcelReadData {

	public static void main(String[] args) {
		
		Xls_Reader xls = new Xls_Reader("S:\\JANBASK\\QA - 27th Sept 2024\\QA Class 31 Data Parameterization\\src\\TestSuite\\TESTSUITE.xlsx");
		
		String v=xls.getCellData("GMAIL", "STATUS", 4);
		//System.out.println(v);
		//xls.addColumn("GMAIL", "Comments");
		
		int rowCount=xls.getRowCount("gmail");
		System.out.println(rowCount);
		
		for(int i=1;i<=rowCount;i++) {
			String c1=xls.getCellData("GMAIL", "TCID", i);
			String c2=xls.getCellData("GMAIL", "TESTCASE", i);
			String c3=xls.getCellData("GMAIL", "STATUS", i);
			System.out.print(c1+" | "+c2+" | "+c3);
			System.out.println();
			
		}
		
	}

}
