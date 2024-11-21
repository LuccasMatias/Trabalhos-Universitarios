import pandas as pd
import matplotlib.pyplot as plt

class AppGrafico:
    def __init__(self, arquivo_dados):
        self.arquivo_dados = arquivo_dados
        self.iris = pd.read_csv(arquivo_dados)
        self.comprimento_petala = self.iris['petal_length']
        self.largura_petala = self.iris['petal_width']

    def criar_grafico(self):
        plt.figure(figsize=(8, 6))
        plt.scatter(self.comprimento_petala, self.largura_petala, color='blue', s=15, label='Pontos do dataset')

        plt.axhspan(ymin=min(self.largura_petala), ymax=max(self.largura_petala), xmin=0.5, xmax=1, color='lightgray', alpha=0.5)
        plt.text(2, max(self.largura_petala) - 0.5, 'Antes', fontsize=12, color='black', ha='center')
        plt.text(5, max(self.largura_petala) - 0.5, 'Depois', fontsize=12, color='black', ha='center')

        plt.show()
