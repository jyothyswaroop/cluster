
package dbca;

import static dbca.L3ItemSetFrame.fact;
import java.util.ArrayList;

public class FindCount 
{
    
    MainFrame mf;
    FindCount(MainFrame me)
    {
        mf=me;
    }
    public String getApp(int k,int m)
    {
           
        String res="";
        try
        {
            ArrayList tval1=FindNItems(k,m);
            ArrayList items=mf.itemSet[3]; // Get Items 
                for(int i=0;i<items.size();i++)
                {
                    String g1=items.get(i).toString();
                    String g2[]=g1.split("#");
                    ArrayList a1=mf.itemSetCount[0];
                    ArrayList a2=mf.itemSetCount[1];
                    ArrayList a3=mf.itemSetCount[2];
                    int k1=0;
                    int k2=0;
                    int k3=0;
            
                    for(int y1=0;y1<g2.length;y1++)
                    {
                        for(int j=0;j<a1.size();j++)
                        {
                            String g3=a1.get(j).toString();
                            String g4[]=g3.split("#");
                            if(g3.startsWith(g2[y1]))
                            {
                                // System.out.println(g3+" : "+g2[y1]);
                                k1=k1+Integer.parseInt(g4[g4.length-1]);
                            }
                            
                        }
                    }
            
            
                    for(int y1=0;y1<g2.length;y1++)
                    {
                        String gs=g2[y1];
                        for(int y2=y1+1;y2<g2.length;y2++)
                        {
                            String  gs1=gs+"#"+g2[y2];
                            for(int j=0;j<a2.size();j++)
                            {
                                String g3=a2.get(j).toString();
                                String g4[]=g3.split("#");
                                //System.out.println("-----------"+g3+" : "+gs1);
                                if(g3.startsWith(gs1))
                                {
                                    // System.out.println(g3+" : "+gs1);
                                    k2=k2+Integer.parseInt(g4[g4.length-1]);
                                }
                            
                            }
                        }
                        
                    }
                    
                    for(int y1=0;y1<g2.length;y1++)
                    {
                        String gs=g2[y1];
                        for(int y2=y1+1;y2<g2.length;y2++)
                        {
                            String  gs1=gs+"#"+g2[y2];
                            for(int y3=y2+1;y3<g2.length;y3++)
                            {    
                                String  gs2=gs1+"#"+g2[y3];
                                for(int j=0;j<a2.size();j++)
                                {
                                    String g3=a2.get(j).toString();
                                    String g4[]=g3.split("#");
                                    //System.out.println("-----------"+g3+" : "+gs1);
                                    if(g3.startsWith(gs2))
                                    {
                                        // System.out.println(g3+" : "+gs1);
                                        k3=k3+Integer.parseInt(g4[g4.length-1]);
                                    }
                            
                                }
                            }
                        }
                        
                    }
                    
                    
                    double e1=Double.parseDouble(tval1.get(0).toString());
                    double e2=Double.parseDouble(tval1.get(1).toString());
                    double e3=Double.parseDouble(tval1.get(2).toString());
                    System.out.println(e1+"*"+k1+" : "+e2+"*"+k2+ " :  "+e3+"*"+k3+" : "+g1);
                    //double e=(e1*k1)-(e2*k2);
                    double e=(1.073972551*k1)-(1.221917654*k2)+(1.51780786*k3);
                    System.out.println("re "+e);
                    
                    ArrayList a4=mf.itemSetCount[2];    
                    int k4=k1-k2-k3;
            
                    System.out.println("k4 "+(k1-k2+k3)) ;
                    System.out.println((-e+k4)/2) ;
            
                    res=res+g1+" :  "+((-e+k4)/2)+"\n\n";
                    
                }
        }
                catch(Exception e)
                {
                    e.printStackTrace();
                }
     return res;
                    
    }
    

   int fact(int val)
   {
	int fa=1;
	for(int i=1;i<val;i++)
	{
            fa+=i;
	}
	//System.out.println("fact "+fa);
        return fa;
    }
   
   public ArrayList FindNItems(int k,int m)
   {
       ArrayList lt1=new ArrayList();
       try
       {
           ArrayList aij=new ArrayList();
            ArrayList ti=new ArrayList();
            int aijVal[][]=new int[m][m];
            for(int i=1;i<m;i++)
            {
                for(int j=1;j<m;j++)
                {
                    System.out.println(i+" : "+j)	;
                    double val=0;
                    if(j>=i)
                    {				
                        val=Math.pow(-1,(i+j));
                        int f1=fact(i);
                        int f2=fact(j);
                        int f3=fact(j-1);
			
                        int kk=f2/(f1*f3);
                        int a=(int)val*kk;
                        System.out.println(i+":"+j+"--->compute ncr : "+a);
                        aij.add(a);
                        aijVal[i][j]=a;
                    }
                    if(j<i)
                    {
                        System.out.println(i+":"+j+"--->0");
                        aij.add("0");
                        aijVal[i][j]=0;
                    }
		 }
			
                 double w1=(-(m+1))/(m-1);
                 double w2=(-(m+1))/(m-1);
                 w2=w2*w2;
                 w2=Math.sqrt(w2-1);
                 double d1=Math.pow((w1+w2),k);
                 double d2=Math.pow((w1-w2),k);
                 double d=d1+d2;
                 double t=1+Math.pow(-1,i)*(2/d);
                 System.out.println("-------- t "+i+" = "+t);
                 ti.add(t);
            }
		
		
            System.out.println(aij+ " : "+ti);
	
	
            for(int i=1;i<aijVal.length;i++)
            {
		for(int j=1;j<aijVal.length;j++)
		{
			System.out.println(aijVal[j][i]+" : "+ti.get(j-1));
		}
		System.out.println("------");
            }
            
            
            for(int i=1;i<aijVal[0].length;i++)
            {
		double d1=0;
		for(int j=1;j<aijVal.length;j++)
		{
                    //System.out.println(aijVal[j][i]+" : "+ti.get(j-1));
                    d1=d1+(aijVal[j][i]*Double.parseDouble(ti.get(j-1).toString()));			
		}
		lt1.add(d1);
		//System.out.println("------");
            }	
            System.out.println(lt1);
            
       }
       catch(Exception e)
       {
           e.printStackTrace();
       }
       return lt1;
   }
              
}
