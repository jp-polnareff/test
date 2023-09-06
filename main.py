import openai

openai.api_key = "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"  # 将YOUR_API_KEY替换为您的OpenAI API密钥

def correct_text(input_text):
    response = openai.Completion.create(
        engine="text-davinci-002",
        prompt=f"Correct the following text: '{input_text}'\n",
        max_tokens=50,  # 可根据需要进行调整
    )

    corrected_text = response.choices[0].text.strip()
    return corrected_text

input_text1 = "I woud like to recieve my oder as soon as posisble."
input_text2 = "The maintenence creew will be fixxing the rood tomorow."

output_text1 = correct_text(input_text1)
output_text2 = correct_text(input_text2)

print("输入1：", input_text1)
print("输出1：", output_text1)

print("输入2：", input_text2)
print("输出2：", output_text2)
