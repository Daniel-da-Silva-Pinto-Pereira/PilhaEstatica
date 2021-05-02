public class PilhaEstatica{
  String vet[];
  int topo;


PilhaEstatica(int tamanho){
  vet = new String[tamanho];
  topo = 0;
}
int tamanho(){
  return topo;
}
boolean cheia(){
  return vet.length == topo;
}
boolean vazia(){
  return topo == 0;
}
boolean inserir(String valor){
  if (cheia()){
    return false;
  }
  vet[topo] = valor;
  topo++;
  return true;
}
String retirar(){
  if (vazia()){
    return null;
  }
  topo--;
  return vet[topo];
}
}