package addressbook;

class Entity{  
    public int id;//���  
    public long stnumber;//ѧ��
    public String name;//����  
    public int age;//����
    public long phone;//��ϵ�绰  
    public String address;//��ַ
    public String email;//����
	
	public String toString() {
		return " ѧ��=" + stnumber + ", ����=" + name
				+ ", ����=" + age + ", �绰=" + phone + ", ��ַ=" + address
				+ ", ����=" + email ;
	}
    
}  