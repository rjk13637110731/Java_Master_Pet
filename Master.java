//主人类
class Master{
	public void feed(Pet p){
		System.out.print("主人喂宠物：");
		if (p instanceof Dog){
			Dog d = (Dog)p;
			d.eat();
		}else if (p instanceof Cat){
			Cat c = (Cat)p;
			c.eat();
		}else if (p instanceof YingWu){
			YingWu y = (YingWu)p;
			y.eat();
		}
	}
}