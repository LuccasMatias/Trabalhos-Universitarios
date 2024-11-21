
from app import AppGrafico

def main():
    arquivo_dados = 'iris.csv'
    app = AppGrafico(arquivo_dados)
    app.criar_grafico()
    
if __name__ == '__main__':
    main()
