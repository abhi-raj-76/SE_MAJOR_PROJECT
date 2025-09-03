import nltk

from nltk.tokenize import word_tokenize

with open('File.txt','r') as File:
    text = File.read()

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
    