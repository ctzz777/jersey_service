/**
 * 
 */
package jersey.bo;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author ted
 *
 */
@XmlRootElement
public class Customer {
	private Long seqNo;
	private String name;
	private Integer age;
	
	public Long getSeqNo() {
		return seqNo;
	}
	public void setSeqNo(Long seqNo) {
		this.seqNo = seqNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
}
