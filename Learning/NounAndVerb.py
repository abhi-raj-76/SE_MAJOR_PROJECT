import nltk

from nltk.tokenize import word_tokenize

text = """Renewable energy is an essential component of sustainable development.
Unlike fossil fuels, which are finite and contribute to environmental degradation,
renewable energy sources such as solar, wind, and hydroelectric power offer a clean and sustainable alternative. These energy sources are abundant and can significantly reduce greenhouse gas emissions, helping to combat climate change.
By investing in renewable energy, 
countries can create jobs, enhance energy security, and promote environmental sustainability."""

tokenized_word = word_tokenize(text);
#print(tokenized_word)

pos_words = nltk.pos_tag(tokenized_word)
#print(pos_words)

noun_tag = ['NN', 'NNS', 'NNP', 'NNPS']
verb_tag = ['VB', 'VBD', 'VBG', 'VBN', 'VBP', 'VBZ']

nouns = []
verbs = []

for tag in pos_words:
    tags = tag[1]
    if tags in noun_tag:
        nouns.append(tag[0])
    elif tags in verb_tag:
        verbs.append(tag[0])
print("All the nouns :",nouns)
print()
print("All the verbs",verbs)
    