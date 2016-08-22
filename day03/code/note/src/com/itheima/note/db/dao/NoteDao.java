package com.itheima.note.db.dao;

import java.util.ArrayList;
import java.util.List;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import com.itheima.note.db.NoteSQLiteOpenHelper;
import com.itheima.note.domain.NoteBean;

/**
 * 记账本的dao
 * 
 * @author Administrator
 * 
 */
public class NoteDao {
	// 因为 任何一个操作都是需要 得到 NoteSQLiteOpenHelper helper
	// 把他放在构造方法里面初始化
	private NoteSQLiteOpenHelper helper;

	public NoteDao(Context context) {
		helper = new NoteSQLiteOpenHelper(context);
	}

	/**
	 * 添加一条账目信息 到数据库
	 * 
	 * @param name
	 *            花销的名称
	 * @param money
	 *            金额
	 */
	public void add(String name, float money) {
		SQLiteDatabase db = helper.getWritableDatabase();
		db.execSQL("insert into account (name,money) values (?,?)",
				new Object[] { name, money });
		// 记住 关闭.
		db.close();
	}



	public void delete(int id) {
		SQLiteDatabase db = helper.getWritableDatabase();
		db.execSQL("delete from account where id=?", new Object[] { id });
		db.close();
	}

	public void update(int id, float newmoney) {
		SQLiteDatabase db = helper.getWritableDatabase();
		db.execSQL("update account set money =? where id=?", new Object[] {
				newmoney, id });
		db.close();
	}

	    db.execSQL("insert into radiomap(location,ap1,ap2) select 'x=1,y=1',-80,-73 " +  
                "union all select 'x=2,y=3',80,40 union all select 'x=3,y=5',30,20 "+  
                   "union all select 'x=4,y=5',3,2 union all select 'x=30,y=50',30,20 union all select 'x=3,y=5',40,20"  
                +" union all select 'x=3,y=5',6,20 union all select 'x=3,y=5',6,7 union all select 'x=3,y=5',7,8 union all select 'x=3,y=5',8,9 union all select 'x=3,y=5',9,9" +  
                        " union all select 'x=3,y=5',3,5 union all select 'x=3,y=5',7,20 union all select 'x=3,y=5',4,20 union all select 'x=3,y=5',5,20 union all select 'x=3,y=5',6,20" +  
                        " union all select 'x=3,y=5',3,6 union all select 'x=3,y=5',7,7 union all select 'x=3,y=5',3,8 union all select 'x=3,y=5',8,2");  
           long b=System.currentTimeMillis();  
           long c=b-a;  
           Log.i("LocationActivity", String.valueOf(c));  
             
           a=System.currentTimeMillis();  
           db.beginTransaction();  
           db.execSQL("insert into radiomap(location,ap1,ap2) values('x=4,y=5',2,3)");  
           db.execSQL("insert into radiomap(location,ap1,ap2) values('x=5,y=6',4,5)");  
           db.execSQL("insert into radiomap(location,ap1,ap2) values('x=6,y=7',6,7)");  
           db.execSQL("insert into radiomap(location,ap1,ap2) values('x=4,y=5',2,3)");  
           db.execSQL("insert into radiomap(location,ap1,ap2) values('x=5,y=6',4,5)");  
           db.execSQL("insert into radiomap(location,ap1,ap2) values('x=6,y=7',6,7)");  
           db.execSQL("insert into radiomap(location,ap1,ap2) values('x=4,y=5',1,3)");  
           db.execSQL("insert into radiomap(location,ap1,ap2) values('x=5,y=6',1,5)");  
           db.execSQL("insert into radiomap(location,ap1,ap2) values('x=6,y=7',1,7)");  
           db.execSQL("insert into radiomap(location,ap1,ap2) values('x=4,y=5',2,3)");  
           db.execSQL("insert into radiomap(location,ap1,ap2) values('x=5,y=6',2,5)");  
           db.execSQL("insert into radiomap(location,ap1,ap2) values('x=6,y=7',2,7)");  
           db.execSQL("insert into radiomap(location,ap1,ap2) values('x=4,y=5',3,3)");  
           db.execSQL("insert into radiomap(location,ap1,ap2) values('x=5,y=6',3,5)");  
           db.execSQL("insert into radiomap(location,ap1,ap2) values('x=6,y=7',3,7)");  
           db.execSQL("insert into radiomap(location,ap1,ap2) values('x=4,y=5',4,3)");  
           db.execSQL("insert into radiomap(location,ap1,ap2) values('x=5,y=7',5,5)");  
           db.execSQL("insert into radiomap(location,ap1,ap2) values('x=6,y=7',4,7)");  
           db.execSQL("insert into radiomap(location,ap1,ap2) values('x=4,y=5',5,3)");  
           db.execSQL("insert into radiomap(location,ap1,ap2) values('x=5,y=6',5,5)");  
           db.setTransactionSuccessful();  
           db.endTransaction();  
           b=System.currentTimeMillis();  
           Log.i("LocationActivity", String.valueOf(b-a));  
              
           a=System.currentTimeMillis();  
           db.execSQL("insert into radiomap(location,ap1,ap2) values('x=7,y=8',7,8)");  
           db.execSQL("insert into radiomap(location,ap1,ap2) values('x=8,y=9',8,9)");  
           db.execSQL("insert into radiomap(location,ap1,ap2) values('x=9,y=10',9,10)");  
           db.execSQL("insert into radiomap(location,ap1,ap2) values('x=4,y=5',2,3)");  
           db.execSQL("insert into radiomap(location,ap1,ap2) values('x=5,y=6',4,5)");  
           db.execSQL("insert into radiomap(location,ap1,ap2) values('x=6,y=7',6,7)");  
           db.execSQL("insert into radiomap(location,ap1,ap2) values('x=4,y=5',2,3)");  
           db.execSQL("insert into radiomap(location,ap1,ap2) values('x=5,y=6',2,5)");  
           db.execSQL("insert into radiomap(location,ap1,ap2) values('x=6,y=7',2,7)");  
           db.execSQL("insert into radiomap(location,ap1,ap2) values('x=4,y=5',3,3)");  
           db.execSQL("insert into radiomap(location,ap1,ap2) values('x=5,y=6',3,5)");  
           db.execSQL("insert into radiomap(location,ap1,ap2) values('x=6,y=7',3,7)");  
           db.execSQL("insert into radiomap(location,ap1,ap2) values('x=4,y=5',4,3)");  
           db.execSQL("insert into radiomap(location,ap1,ap2) values('x=5,y=6',4,4)");  
           db.execSQL("insert into radiomap(location,ap1,ap2) values('x=6,y=7',4,7)");  
           db.execSQL("insert into radiomap(location,ap1,ap2) values('x=4,y=5',5,3)");  
           db.execSQL("insert into radiomap(location,ap1,ap2) values('x=5,y=7',6,5)");  
           db.execSQL("insert into radiomap(location,ap1,ap2) values('x=6,y=7',5,7)");  
           db.execSQL("insert into radiomap(location,ap1,ap2) values('x=4,y=5',6,3)");  
           db.execSQL("insert into radiomap(location,ap1,ap2) values('x=5,y=6',6,5)");  
           b=System.currentTimeMillis();  
           Log.i("LocationActivity", String.valueOf(b-a));  
        }  

第一种方式及：

insert into 表名(列名1,列名2)    
 select  值1,值2
 union all 
 select 值1,值2  
 union all 
 select 值1,值2 

以上三种方式测试结果，及运行效率：

第一种方式为9ms

用事务的为：86ms

第三种直接用insert插入的为：29ms

这是因为本次测试用了20条数据，所以用事务的反而比不用的开销大时间长。若1000条以上则明显快于直接用insert插入的。
更多 0

    上一篇android面试题总结
    下一篇Android开发指南-窗口小部件（App Widgets）

顶
    0

踩
    0

主题推荐
    数据库 sqlite android android开发 事务 

猜你在找
    Eclipse 重装 ADT 问题~重装系统有感~
    iOS开发如何实现消息推送机制
    javascript 只允许输入数字总结
    5个优秀的在线调试代码网站
    百度地图api---实现新建地图
    ListView中item progressbar显示混乱的问题
    Android中的线程机制（Handler Looper）（二）
    android 实现透明按钮
    去掉 android dialog 白色边框
    Android项目合并

查看评论

3楼 LeungYong 2013-01-05 10:19发表 [回复]
    貌似实现不了

2楼 minggoddess 2012-05-25 22:49发表 [回复]
    哦 不用了 我明白了 有begintranction的那个是

Re: android_qhdxuan 2012-06-05 11:08发表 [回复]
    回复minggoddess：恩，是的！不好意思最近一段时间一直 没有上CSDN，刚看到你的留言！！

1楼 minggoddess 2012-05-25 22:48发表 [回复]
    你这个代码里哪段是用事务啊 我怎么只看到insert的

您还没有登录,请[登录]或[注册]
* 以上用户言论只代表其个人观点，不代表CSDN网站的观点或立场
TOP
核心技术类目
全部主题 Java VPN Android iOS ERP IE10 Eclipse CRM JavaScript Ubuntu NFC WAP jQuery 数据库 BI HTML5 Spring Apache Hadoop .NET API HTML SDK IIS Fedora XML LBS Unity Splashtop UML components Windows Mobile Rails QEMU KDE Cassandra CloudStack FTC coremail OPhone CouchBase 云计算 iOS6 Rackspace Web App SpringSide Maemo Compuware 大数据 aptech Perl Tornado Ruby Hibernate ThinkPHP Spark HBase Pure Solr Angular Cloud Foundry Redis Scala Django Bootstrap

    个人资料

    [访问我的空间]
    android_qhdxuan
        访问：32108次
        积分：440分
        排名：千里之外
        原创：10篇
        转载：10篇
        译文：0篇
        评论：14条

    about me

    燕山大学 计算机软件与理论硕士研究生 

    文章搜索

    文章分类

    Android相关(15)
    JAVA基础(3)
    Linux相关(1)
    算法(1)

    文章存档

    2012年06月(1)
    2012年04月(2)
    2012年03月(5)
    2011年12月(4)
    2011年11月(8)

    阅读排行 

    Ubuntu中如何切换到超级用户（root）及在VMware虚拟机中Linux在虚拟终端之间切换的方法(8629)
    Android wifi 信号强度单位 dbm(5417)
    Android 方向传感器与磁力计和加速度传感器之间的关系(4970)
    android中SQLite数据库中用insert同时插入多条记录的方法和效率比较(3916)
    Android中的线程机制(2189)
    传感器介绍(1076)
    Android中的线程机制（Handler Looper）（二）(860)
    Java类的加载，连接和运行过程(847)
    android 新浪微博客户端的表情功能的实现(598)
    用javap 反编译命令解释i=i++问题(521)

    评论排行

    android中SQLite数据库中用insert同时插入多条记录的方法和效率比较(4)
    Android 方向传感器与磁力计和加速度传感器之间的关系(4)
    Android wifi 信号强度单位 dbm(3)
    Android中的线程机制（Handler Looper）（二）(2)
    Ubuntu中如何切换到超级用户（root）及在VMware虚拟机中Linux在虚拟终端之间切换的方法(1)
    百度Android开发面试题(0)
    Android开发指南-窗口小部件（App Widgets）(0)
    android 新浪微博客户端的表情功能的实现(0)
    传感器介绍(0)
    用javap 反编译命令解释i=i++问题(0)

    推荐文章

    最新评论

    Android 方向传感器与磁力计和加速度传感器之间的关系

    lyz25: 请问手机有磁场感应器，但是检测不到变化，就没发用SensorManager.getRotationM...
    Android 方向传感器与磁力计和加速度传感器之间的关系

    guanting207: 博主 检测不到磁场感应器是什么原因呢
    Android 方向传感器与磁力计和加速度传感器之间的关系

    liuxxyy: 谢谢博主，请问哪个角度在手机静止时还在不清的变化，而且数值变化差距很大，这怎么解决？？？
    Android wifi 信号强度单位 dbm

    sunnykaby: 用 wifimanager.startScan()wifimanager.getScanReasul...
    Android wifi 信号强度单位 dbm

    luxj: 用 wifimanager.startScan()wifimanager.getScanReasul...
    Android wifi 信号强度单位 dbm

    wpweng: 问个问题，那为什么wifi信号强度值为负值，如果看到的是-20dBm，那按计算公式反算出的功率是0....
    Android 方向传感器与磁力计和加速度传感器之间的关系

    sailaway: 解答了很多的不解，谢谢。另外问下博主remapCoordinateSystem这个函数怎么使用？是不...
    android中SQLite数据库中用insert同时插入多条记录的方法和效率比较

    LeungYong: 貌似实现不了
    Android中的线程机制（Handler Looper）（二）

    joycean: handler=new Handler(thread.getLooper());thread.sta...
    android中SQLite数据库中用insert同时插入多条记录的方法和效率比较

    android_qhdxuan: @minggoddess:恩，是的！不好意思最近一段时间一直 没有上CSDN，刚看到你的留言！！



	/**
	 * 返回数据库所有的条目
	 * 
	 * @return
	 */
	public List<NoteBean> findAll() {
		// 得到可读的数据库
		SQLiteDatabase db = helper.getReadableDatabase();
		List<NoteBean> noteBeans = new ArrayList<NoteBean>();
		// 获取到数据库查询的结果游标
		Cursor cursor = db.rawQuery("select id,money,name from account ", null);
		while (cursor.moveToNext()) {
			int id = cursor.getInt(cursor.getColumnIndex("id"));
			String name = cursor.getString(cursor.getColumnIndex("name"));
			float money = cursor.getFloat(cursor.getColumnIndex("money"));
			NoteBean bean = new NoteBean(id, money, name);
			noteBeans.add(bean);
			bean = null;
		}

		db.close();
		return noteBeans;
	}

	/**
	 * 模拟一个转账的操作. 使用数据库的事务
	 * 
	 * @throws Exception
	 */
	public void testTransaction() throws Exception {
		// 得到可写的数据库
		SQLiteDatabase db = helper.getWritableDatabase();
		db.beginTransaction(); // 开始事务
		try {
			db.execSQL("update account set money = money - 5 where id=? ",
					new String[] { "2" });
			db.execSQL("update account set money = money + 5 where id=? ",
					new String[] { "3" });
			db.setTransactionSuccessful();
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			db.endTransaction();//关闭事务.
			db.close();
		}

	}

}
