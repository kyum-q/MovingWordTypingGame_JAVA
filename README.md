# 보석을 찾아 부자가 될거야
화면에 랜덤하게 떨어지는 단어와 똑같이 타이핑을 하여 점수를 얻는 단어 타이핑 게임

## 💍&nbsp; 작품 소개

**운석이 떨어져 아름다운 보석들이 가득한 동굴에 가기로 한 당신, 당신은 그 곳에서 얼마나 아름다운 보석들을 가지고 올 것인가?**<br>

보석을 가지고 오기 위해서는 떨어지는 보석에 적힌 단어를 입력하면 된다. 그렇게 기본 체력 3개를 가지고 모험을 시작한다. 보석을 입력하지 못하고 바닥에 보석이 떨어지면 체력이 하나 사라진다. 100점을 달성하지 못하거나 체력이 모두 사라지면 게임이 실패로, 체력을 다 쓰지 않고 100점을 만들면 성공으로 게임은 종료된다.<br>

### 💎&nbsp; 보석의 종류

보석이 종류는 3가지이다.

#### 1) 평범한 보석
평범한 보석은 보석에 적힌 단어를 한 번만 타이핑하면 보석을 쟁취할 수 있고 보석 포인트 [10point] 를 얻을 수 있다. 땅에 떨어지면 생명이 감소된다.<br>

#### 2) 아름다운 보석 : 루비(빨간색), 사파이어(파란색) 
아름다운 보석을 획득하기 위해서는 보석의 적힌 단어를 두 번 타이핑 해야 한다. 두 번의 타이핑 단어는 다른 단어이고 보석을 쟁취하면 보석 포인트 [20point] 를 얻을 수 있다. 땅에 떨어지면 생명이 감소된다.<br> 

#### 3) 세상에서 가장 아름다운 보석 : 다이아몬드 (하얀색)
다이아몬드는 다른 보석에 비해 더 빠른 속도로 떨어진다. 하지만 단 한번의 타이핑으로 얻을 수 있다. 다이아몬드를 얻게되면 그때부터 3초간 키보드를 최대한 많이 타이핑하면 된다. 그러면 [키를 입력한 수 * 2point] 만큼 보석 포인트를 얻을 수 있다.<br>

### 🎁&nbsp; 아이템 종류

보석 외에도 보석을 얻는데 도움을 주는 아이템 폭탄, 빵, 곡괭이가 존재한다. 이 아이템들 또한 보석을 얻는 것처럼 단어를 가지고 떨어지므로 타이핑을 통해 획득할 수 있다.

#### 1) 폭탄 &nbsp;💣

폭탄은 아이템을 획득하면 자신의 아이템 창고에 저장해 둔 뒤 사용하고 싶을 때 ‘!’를 입력하면 사용할 수 있다. 이는 보석 획득보다 목숨 유지가 중요할 때 사용하면 좋은 아이템이다. 폭탄을 사용하면 화면에 보석을 모두 없앨 수 있다. <br>

#### 2) 곡괭이 &nbsp;⛏

곡괭이는 아이템을 획득함과 동시에 자동으로 사용된다. 이는 보석 획득이 중요할 때 사용하면 좋은 아이템이다.
곡괭이는 곡괭이를 이용해 보석을 발굴하는 것처럼 보석 발굴에 도움을 주는 아이템이다. 곡괭이를 사용하면 5초가량 보석의 속도를 원래 속도의 절반 속도로 늦출 수 있다. <br>

#### 3) 빵 &nbsp;🥖

빵은 아이템을 획득함과 동시에 자동으로 사용된다. 이는 보석 획득이 중요할 때 사용하면 좋은 아이템이다.
빵은 일하면서 음식을 먹으면 기운이 나는 것처럼 체력을 하나 증가시켜주는 아이템이다. (체력은 최대 5개까지 증가시킬 수 있다)<br>

### ⚙️&nbsp; 게임 추가 설정

게임 난이도는 총 3단계로 단계별로 떨어지는 보석의 속도와 화면에 등장할 수 있는 단어 수의 차이가 있다.
단어 언어는 한글과 영어를 지원하고 있다.<br>

그리고 오른쪽에 **‘보석이 있는 곳을 나에게 알려줘!’** 아래 입력 칸를 통해 단어를 추가 할 수 있다.<br>

이러한 게임은 위에 튤바에 play버튼을 통해 게임을 시작하거나 아래 JTextDField에 ‘play’를 입력하면 시작된다. 그리고 그 옆에 stop버튼을 통해 게임을 강제로 종료할 수 있다. 마지막으로 그옆에 Set 버튼을 통해 언어변경과 난이도 변경을 할 수 있다.<br><br>

## 게임 실행 화면

![Group 4](https://github.com/kyum-q/MovingWordTypingGame/assets/109158497/e7dcbcba-fdb5-4869-a8c8-25d2b0debbe7)
**<p align="center"> [게임 시작 화면] </p>**
<br>
![Group 5](https://github.com/kyum-q/MovingWordTypingGame/assets/109158497/74213f78-fdd2-4950-b72b-7aedbb5ee8ef)
**<p align="center"> [곡괭이 아이템 획득 시 화면] &emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp; [폭탄 아이템 획득 시 화면] </p>**
<br>

![Group 6](https://github.com/kyum-q/MovingWordTypingGame/assets/109158497/15130244-4a17-4299-8deb-287670ee56dc)
**<p align="center"> [빵 아이템 획득 전 화면] &emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp; [빵 아이템 획득 후 화면] </p>**
> 목숨 증가
<br>

![Group 7](https://github.com/kyum-q/MovingWordTypingGame/assets/109158497/1e5bc9ae-37aa-4a94-b9c2-a06b4b2a6679)
**<p align="center">[다이아몬드 획득 시 화면]</p>**
> 3초동안 해당 화면으로 보여짐<br>
> 키보드를 많이 누를 수록 노란 바가 채워져, 획득한 point 값을 어림짐작할 수 있다.
<br>

![Group 1](https://github.com/kyum-q/MovingWordTypingGame/assets/109158497/7102a03d-9fec-4295-875d-6332a962657b)
**<p align="center">[게임 설정 화면]</p>**
> 튤바에 Set버튼을 누르면 나타나는 게임 설정 창(GameSetFrame)이다.이곳에서 레벨(난이도)과 타이핑 언어를 선택 할 수 있다.
<br>

![Group 8](https://github.com/kyum-q/MovingWordTypingGame/assets/109158497/60bafb69-e137-483b-9001-687cb91bde5f)
**<p align="center">[한글로 언어 변경 시 실행 화면]</p>**
<br>

![Group 3](https://github.com/kyum-q/MovingWordTypingGame/assets/109158497/9d885c06-652a-4dc4-be82-4debe11329bf)
**<p align="center"> [게임 성공 화면] &emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp; [게임 실패 화면] </p>**
<br>

## 🧩 프로그램 구조

### 1) 게임 화면 구성

<img width="1188" alt="image" src="https://github.com/kyum-q/MovingWordTypingGame/assets/109158497/ca8272bd-ac5e-46e8-a1a8-409fc2e96ca1">

**GameFrame** : [Frame 창] 튤바를 제작하고 GamePanel에게 튤바를 제외한 영역을 설정할 수 있게 만들어준다.<br><br>
**GamePanel** : Frame에 MainPanel로 Panel을 세부적으로 나누고 게임 진행을 도와준다.<br><br>
**GameInitPanel** : 본 게임을 시작하기 전, 게임이 종료되었을 때 GamePanel의 센터에 위치한다.<br><br>
**GameGroundPanel** : 본 게임이 시작된 후 GameInitPanel을 숨기고 GamePanel의 센터에 위치한다. 
떨어지는 타이핑 단어가 이 곳에 나타난다. (단어는 TextSource을 통해 가지고 온다)<br><br>
**ScorePanel** : 게임 획득 점수와 생명, speed 변화, item을 표시한다.<br><br>
**EditPanel** : 버튼을 누르면 TextSource를 통해 JTextField의 단어를 타이핑 단어가 있는 txt파일에 단어 추가할 수 있다.<br><br>
**InputPanel** : JTextField에 화면에 나타난 타이핑 단어를 입력하는 곳이다. 단어를 입력하고 엔터를 치면 입력된 단어가 화면에 있는 타이핑 단어와 같은지 확인할 수 있다.<br><br>
> 위에 튤바에 버튼을 이용할 수 있다. Play버튼은 게임 시작을 Stop버튼은 게임 종료를 Set버튼은 게임 설정을 도와 준다.

<br>

### 2) 보석과 아이템 움직임을 도와주는 Thread

<img width="1126" alt="image" src="https://github.com/kyum-q/MovingWordTypingGame/assets/109158497/4c648a6b-9d8a-40ad-8a68-9fea7993de62">

- 평범한 보석과 아름다운 보석(루비, 사파이어) : TextMoveThread로 움직임
- 세상에서 가장 아름다운 보석(다이아몬드) : DiamondThread로 움직임
- Item(빵, 폭탄, 곡괭이) : ItemThread로 움직임
<br><br>

### 3) 프로젝트의 간단한 흐름도

<img width="1440" alt="image" src="https://github.com/kyum-q/MovingWordTypingGame/assets/109158497/f7cd36a0-ebf6-4114-ab58-dee0a030f479">
<br>
1. start버튼이나 play를 입력하면 startGameTh()가 호출되면서 크게 두가지 활동을 한다. <br><br>
&emsp;&emsp; 1) startGamePanel()을 호출해 GameInitPanel을 숨기고 GameGroundPanel을 보이게 만든다. <br>
&emsp;&emsp; 2) GameThread를 제작하고 GameThread를 동작시키는 것이다. <br>
<br>
2. GameThread가 동작하면서 이제 랜덤한 시간 텀을 가지고 textMake()를 호출하여 화면에 단어를 보이게 한다. <br>
<br>

> **textMake() 보석 및 아이템 제작 확률** <br><br>
> 10%: 다이아몬드 보석 제작<br>
> 15%: 아이템 제작<br>
> 20%: 아름다운 보석 (루비, 사파이어)<br>
> 55%: 평범한 보석<br>
<br>

## 💡&nbsp; 개발 언어
<img src="https://img.shields.io/badge/JAVA-FF7800?style=for-the-badge&logo=Java&logoColor=#7F52FF">
