import java.io.*;
class Edge
{
int a1,a2,t;
}
class kruskalsalgo
{
public static void main(String args[])throws IOException
{
int ik,j,mincost=0;
BufferedReader br=new BufferedReader( new InputStreamReader(System.in));
System.out.println(" Enter no.of vertices:");
int v=Integer.parseInt(br.readLine());
System.out.println(" Enter no.of edges:");
int e=Integer.parseInt(br.readLine());
Edge ed[]=new Edge[e+1];
for(ik=1;ik<=e;ik++)
{
ed[ik]=new Edge();
System.out.println(" Enter the vertices and the weight of edge "+(ik)+ ":");
ed[ik].a1=Integer.parseInt(br.readLine());
ed[ik].a2=Integer.parseInt(br.readLine());
ed[ik].t=Integer.parseInt(br.readLine());
}
for(ik=1;ik<=e;ik++)
for(j=1;j<=e-1;j++)
{
if(ed[j].t>ed[j+1].t)
{
Edge t=new Edge();
t=ed[j];
ed[j]=ed[j+1];
ed[j+1]=t;
}
}
int visited[]=new int[v+1];
for(ik=1;ik<=v;ik++)
visited[ik]=0;
System.out.println("MINIMUM SPANNING TREE :");
for(ik=1;ik<=e;ik++)
{
if(ik>v)
break;
else if( visited[ed[ik].a1]==0 || visited[ed[ik].a2]==0)
{
System.out.println(ed[ik].a1+ "-"+ ed[ik].a2);
visited[ed[ik].a1]=visited[ed[ik].a2]=1;
mincost+=ed[ik].t;
}
}
System.out.println("MINIMUM COST = " +mincost);
}
}
