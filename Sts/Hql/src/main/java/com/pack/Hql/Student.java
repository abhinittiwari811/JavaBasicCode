package com.pack.Hql;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {

	
		private String sname;
		@Id
		private int sid;
		private int mark;
	
		@Override
		public String toString() {
			return "Student [sname=" + sname + ", sid=" + sid + ", mark=" + mark + "]";
		}
		public String getSname() {
			return sname;
		}
		public void setSname(String sname) {
			this.sname = sname;
		}
		public int getSid() {
			return sid;
		}
		public void setSid(int sid) {
			this.sid = sid;
		}
		public int getMark() {
			return mark;
		}
		public void setMark(int mark) {
			this.mark = mark;
		}
		
}
