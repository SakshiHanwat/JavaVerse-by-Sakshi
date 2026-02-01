<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8" />
<meta name="viewport" content="width=device-width, initial-scale=1.0"/>
<title>Fundamentals of Programming</title>
<style>
  @import url('https://fonts.googleapis.com/css2?family=IBM+Plex+Mono:wght@400;600&family=Playfair+Display:wght@700;900&family=Inter:wght@300;400;500&display=swap');

  :root {
    --bg: #0a0e1a;
    --card: #111827;
    --card-border: #1e293b;
    --accent: #38bdf8;
    --accent2: #a78bfa;
    --accent3: #34d399;
    --accent4: #fb923c;
    --text: #e2e8f0;
    --text-muted: #64748b;
    --text-bright: #f8fafc;
  }

  * { margin: 0; padding: 0; box-sizing: border-box; }

  body {
    font-family: 'Inter', sans-serif;
    background: var(--bg);
    color: var(--text);
    min-height: 100vh;
    line-height: 1.7;
    overflow-x: hidden;
  }

  /* Ambient background */
  body::before {
    content: '';
    position: fixed;
    top: -40%;
    left: -20%;
    width: 140%;
    height: 140%;
    background:
      radial-gradient(ellipse 600px 400px at 20% 20%, rgba(56,189,248,0.06) 0%, transparent 70%),
      radial-gradient(ellipse 500px 500px at 80% 60%, rgba(167,139,250,0.05) 0%, transparent 70%),
      radial-gradient(ellipse 400px 300px at 50% 90%, rgba(52,211,153,0.04) 0%, transparent 70%);
    pointer-events: none;
    z-index: 0;
  }

  .container {
    position: relative;
    z-index: 1;
    max-width: 860px;
    margin: 0 auto;
    padding: 60px 24px 100px;
  }

  /* ─── HEADER ─── */
  .header {
    text-align: center;
    margin-bottom: 70px;
  }
  .header .tag {
    display: inline-block;
    font-family: 'IBM Plex Mono', monospace;
    font-size: 11px;
    letter-spacing: 3px;
    text-transform: uppercase;
    color: var(--accent);
    background: rgba(56,189,248,0.08);
    border: 1px solid rgba(56,189,248,0.2);
    border-radius: 30px;
    padding: 6px 18px;
    margin-bottom: 24px;
  }
  .header h1 {
    font-family: 'Playfair Display', serif;
    font-size: 48px;
    font-weight: 900;
    color: var(--text-bright);
    line-height: 1.15;
    letter-spacing: -1px;
  }
  .header h1 span { color: var(--accent); }
  .header .subtitle {
    margin-top: 16px;
    font-size: 15px;
    color: var(--text-muted);
    font-weight: 300;
    max-width: 540px;
    margin-left: auto;
    margin-right: auto;
  }

  /* ─── SECTION TITLES ─── */
  .section-label {
    display: flex;
    align-items: center;
    gap: 14px;
    margin-bottom: 20px;
    margin-top: 56px;
  }
  .section-label:first-of-type { margin-top: 0; }
  .section-num {
    font-family: 'IBM Plex Mono', monospace;
    font-size: 11px;
    color: var(--accent);
    background: rgba(56,189,248,0.1);
    padding: 4px 10px;
    border-radius: 6px;
    font-weight: 600;
  }
  .section-label h2 {
    font-family: 'Playfair Display', serif;
    font-size: 24px;
    font-weight: 700;
    color: var(--text-bright);
  }

  /* ─── CARDS ─── */
  .card {
    background: var(--card);
    border: 1px solid var(--card-border);
    border-radius: 16px;
    padding: 28px 30px;
    margin-bottom: 18px;
    position: relative;
    transition: border-color 0.3s;
  }
  .card:hover { border-color: rgba(56,189,248,0.3); }

  .card p {
    font-size: 14.5px;
    color: var(--text);
    font-weight: 300;
  }
  .card p + p { margin-top: 12px; }

  /* highlight keyword */
  .kw {
    color: var(--accent);
    font-family: 'IBM Plex Mono', monospace;
    font-size: 13px;
    font-weight: 600;
  }
  .kw2 { color: var(--accent2); }
  .kw3 { color: var(--accent3); }
  .kw4 { color: var(--accent4); }

  /* ─── FLOW DIAGRAM ─── */
  .flow {
    display: flex;
    flex-direction: column;
    align-items: center;
    gap: 0;
    margin: 28px 0 10px;
  }
  .flow-box {
    display: flex;
    align-items: center;
    gap: 14px;
    background: var(--card);
    border: 1px solid var(--card-border);
    border-radius: 12px;
    padding: 14px 22px;
    width: 100%;
    max-width: 500px;
    transition: border-color 0.3s;
  }
  .flow-box:hover { border-color: rgba(56,189,248,0.25); }

  .flow-icon {
    width: 40px;
    height: 40px;
    border-radius: 10px;
    display: flex;
    align-items: center;
    justify-content: center;
    font-size: 18px;
    flex-shrink: 0;
  }
  .flow-icon.blue { background: rgba(56,189,248,0.12); color: var(--accent); }
  .flow-icon.purple { background: rgba(167,139,250,0.12); color: var(--accent2); }
  .flow-icon.green { background: rgba(52,211,153,0.12); color: var(--accent3); }
  .flow-icon.orange { background: rgba(251,146,60,0.12); color: var(--accent4); }

  .flow-content .flow-title {
    font-size: 14px;
    font-weight: 500;
    color: var(--text-bright);
    font-family: 'IBM Plex Mono', monospace;
  }
  .flow-content .flow-sub {
    font-size: 12px;
    color: var(--text-muted);
    margin-top: 2px;
  }

  .flow-arrow {
    width: 2px;
    height: 22px;
    background: linear-gradient(to bottom, var(--accent), var(--accent2));
    position: relative;
  }
  .flow-arrow::after {
    content: '▼';
    position: absolute;
    bottom: -6px;
    left: 50%;
    transform: translateX(-50%);
    font-size: 10px;
    color: var(--accent2);
  }

  /* ─── CODE / BINARY BLOCKS ─── */
  .code-row {
    display: flex;
    gap: 12px;
    flex-wrap: wrap;
    margin-top: 16px;
  }
  .code-chip {
    font-family: 'IBM Plex Mono', monospace;
    font-size: 12.5px;
    padding: 8px 14px;
    border-radius: 8px;
    background: rgba(56,189,248,0.07);
    border: 1px solid rgba(56,189,248,0.15);
    color: var(--accent);
  }
  .code-chip.purple {
    background: rgba(167,139,250,0.07);
    border-color: rgba(167,139,250,0.15);
    color: var(--accent2);
  }
  .code-chip.green {
    background: rgba(52,211,153,0.07);
    border-color: rgba(52,211,153,0.15);
    color: var(--accent3);
  }

  /* ─── TABLE ─── */
  .compare-table {
    width: 100%;
    border-collapse: collapse;
    margin-top: 18px;
    border-radius: 10px;
    overflow: hidden;
    border: 1px solid var(--card-border);
  }
  .compare-table th {
    background: rgba(56,189,248,0.08);
    color: var(--accent);
    font-family: 'IBM Plex Mono', monospace;
    font-size: 11px;
    text-transform: uppercase;
    letter-spacing: 1.5px;
    padding: 12px 16px;
    text-align: left;
    font-weight: 600;
  }
  .compare-table td {
    padding: 11px 16px;
    font-size: 13.5px;
    color: var(--text);
    border-top: 1px solid var(--card-border);
    font-weight: 300;
  }
  .compare-table tr:nth-child(even) td { background: rgba(255,255,255,0.02); }

  /* ─── HIGHLIGHT BOX ─── */
  .highlight-box {
    border-left: 3px solid var(--accent);
    background: rgba(56,189,248,0.05);
    border-radius: 0 10px 10px 0;
    padding: 18px 22px;
    margin: 20px 0;
  }
  .highlight-box p { font-size: 14px; color: var(--text); }
  .highlight-box .hl-title {
    font-family: 'IBM Plex Mono', monospace;
    font-size: 11px;
    text-transform: uppercase;
    letter-spacing: 2px;
    color: var(--accent);
    margin-bottom: 6px;
    font-weight: 600;
  }

  .highlight-box.purple { border-left-color: var(--accent2); background: rgba(167,139,250,0.05); }
  .highlight-box.purple .hl-title { color: var(--accent2); }

  .highlight-box.green { border-left-color: var(--accent3); background: rgba(52,211,153,0.05); }
  .highlight-box.green .hl-title { color: var(--accent3); }

  /* ─── TIMELINE at the bottom ─── */
  .timeline {
    margin-top: 10px;
    position: relative;
    padding-left: 28px;
  }
  .timeline::before {
    content: '';
    position: absolute;
    left: 9px;
    top: 0;
    bottom: 0;
    width: 2px;
    background: linear-gradient(to bottom, var(--accent), var(--accent2), var(--accent3));
    border-radius: 2px;
  }
  .timeline-item {
    position: relative;
    margin-bottom: 24px;
  }
  .timeline-item::before {
    content: '';
    position: absolute;
    left: -23px;
    top: 7px;
    width: 12px;
    height: 12px;
    border-radius: 50%;
    background: var(--accent);
    border: 2px solid var(--bg);
    box-shadow: 0 0 0 2px var(--accent);
  }
  .timeline-item:nth-child(2)::before { background: var(--accent2); box-shadow: 0 0 0 2px var(--accent2); }
  .timeline-item:nth-child(3)::before { background: var(--accent3); box-shadow: 0 0 0 2px var(--accent3); }
  .timeline-item:nth-child(4)::before { background: var(--accent4); box-shadow: 0 0 0 2px var(--accent4); }

  .timeline-item .t-year {
    font-family: 'IBM Plex Mono', monospace;
    font-size: 11px;
    font-weight: 600;
    color: var(--accent);
    text-transform: uppercase;
    letter-spacing: 1px;
  }
  .timeline-item:nth-child(2) .t-year { color: var(--accent2); }
  .timeline-item:nth-child(3) .t-year { color: var(--accent3); }
  .timeline-item:nth-child(4) .t-year { color: var(--accent4); }

  .timeline-item .t-title {
    font-size: 15px;
    font-weight: 500;
    color: var(--text-bright);
    margin-top: 2px;
  }
  .timeline-item .t-desc {
    font-size: 13px;
    color: var(--text-muted);
    margin-top: 4px;
    font-weight: 300;
  }

  /* ─── FOOTER ─── */
  .footer {
    text-align: center;
    margin-top: 70px;
    padding-top: 30px;
    border-top: 1px solid var(--card-border);
  }
  .footer p {
    font-size: 12px;
    color: var(--text-muted);
    font-family: 'IBM Plex Mono', monospace;
  }

  /* animations */
  @keyframes fadeUp {
    from { opacity: 0; transform: translateY(18px); }
    to   { opacity: 1; transform: translateY(0); }
  }
  .card, .flow-box, .highlight-box {
    animation: fadeUp 0.5s ease both;
  }
</style>
</head>
<body>

<div class="container">

  <!-- HEADER -->
  <div class="header">
    <div class="tag">📘 Telusko — Lesson 4.2</div>
    <h1>Fundamentals of <span>Programming</span></h1>
    <p class="subtitle">A complete walkthrough — from how a CPU thinks in 0s and 1s, all the way up to the high-level languages we write code in today.</p>
  </div>

  <!-- ─── 1. WHAT IS A COMPUTER? ─── -->
  <div class="section-label">
    <span class="section-num">01</span>
    <h2>What Is a Computer?</h2>
  </div>
  <div class="card">
    <p>A <span class="kw">computer</span> is a machine that was invented to <strong style="color:var(--text-bright)">reduce human workload</strong>. Humans give instructions to the computer, and the computer executes those instructions on their behalf — quickly, accurately, and without getting tired.</p>
    <p>The central part of every computer is its <span class="kw">CPU (Central Processing Unit)</span> — often called the <strong style="color:var(--text-bright)">"brain" of the computer</strong>. The CPU is responsible for understanding and carrying out every single instruction a computer receives.</p>
  </div>

  <!-- ─── 2. CPU & SEMICONDUCTOR ─── -->
  <div class="section-label">
    <span class="section-num">02</span>
    <h2>CPU & Semiconductor Technology</h2>
  </div>
  <div class="card">
    <p>The CPU is built using <span class="kw">semiconductor technology</span>. Inside this tiny chip, there are billions of tiny components called <span class="kw">transistors</span>. Specifically, <strong style="color:var(--text-bright)">NPN (Negative-Positive-Negative)</strong> and <strong style="color:var(--text-bright)">PNP (Positive-Negative-Positive)</strong> type transistors are used.</p>
    <p>A transistor has only <strong style="color:var(--text-bright)">two possible states</strong>:</p>
  </div>
  <div class="code-row" style="margin-bottom:18px; padding: 0 4px;">
    <div class="code-chip" style="flex:1; text-align:center; padding:12px;">⚡ <strong>High Voltage</strong> → represented as <span style="color:var(--accent3);font-size:18px;font-weight:700">1</span></div>
    <div class="code-chip purple" style="flex:1; text-align:center; padding:12px;">〰️ <strong>Low Voltage</strong> → represented as <span style="color:var(--accent4);font-size:18px;font-weight:700">0</span></div>
  </div>
  <div class="highlight-box">
    <div class="hl-title">🔑 Key Insight</div>
    <p>This is the most fundamental truth in computing: <strong style="color:var(--text-bright)">the CPU only understands two things — 0 and 1</strong>. Everything a computer ever does, no matter how complex, ultimately boils down to manipulating sequences of 0s and 1s.</p>
  </div>

  <!-- ─── 3. MACHINE LEVEL LANGUAGE ─── -->
  <div class="section-label">
    <span class="section-num">03</span>
    <h2>Machine Level Language (MLL)</h2>
  </div>
  <div class="card">
    <p>Since the CPU only understands <span class="kw">0</span> and <span class="kw">1</span>, the very first language used to communicate with computers was called <span class="kw">Machine Level Language (MLL)</span>. Every instruction is written as a long sequence of binary digits (0s and 1s).</p>
    <p><strong style="color:var(--text-bright)">Example of MLL instructions:</strong></p>
    <div class="code-row" style="margin-top:14px;">
      <div class="code-chip">01010 — ADD</div>
      <div class="code-chip">10101 — SUB</div>
      <div class="code-chip">00101 — MUL</div>
      <div class="code-chip">11101 — DIV</div>
    </div>
  </div>
  <div class="highlight-box purple">
    <div class="hl-title">⚠️ Problem with MLL</div>
    <p>Writing even a simple program like a <strong style="color:var(--text-bright)">calculator</strong> in machine language requires hundreds of lines of 0s and 1s. It is extremely <strong style="color:var(--text-bright)">difficult to write, read, maintain, and debug</strong>. A single mistake in one digit can crash the entire program.</p>
  </div>

  <!-- ─── 4. ASSEMBLY LEVEL LANGUAGE ─── -->
  <div class="section-label">
    <span class="section-num">04</span>
    <h2>Assembly Level Language (ALL)</h2>
  </div>
  <div class="card">
    <p>To make programming easier, scientists introduced <span class="kw">Assembly Level Language (ALL)</span>. Instead of writing long binary codes, programmers could now use short, meaningful <strong style="color:var(--text-bright)">mnemonics (short keywords)</strong> to represent operations.</p>
    <p><strong style="color:var(--text-bright)">Example of Assembly Instructions:</strong></p>
    <div class="code-row" style="margin-top:14px;">
      <div class="code-chip purple">ADD — Addition</div>
      <div class="code-chip purple">SUB — Subtraction</div>
      <div class="code-chip purple">MUL — Multiplication</div>
      <div class="code-chip purple">DIV — Division</div>
    </div>
  </div>
  <div class="highlight-box">
    <div class="hl-title">🔄 The Assembler</div>
    <p>But here's the catch — the CPU still only understands 0s and 1s! So a special program called an <span class="kw">Assembler</span> was created. The Assembler's job is to <strong style="color:var(--text-bright)">convert Assembly Language into Machine Level Language</strong> so that the CPU can execute it.</p>
  </div>
  <div class="highlight-box purple">
    <div class="hl-title">⚠️ Problem with Assembly</div>
    <p>Although Assembly was easier than MLL, it was still very <strong style="color:var(--text-bright)">complex and hardware-specific</strong>. A program written for one CPU would not work on another. It was not practical for building large, modern applications.</p>
  </div>

  <!-- ─── 5. HIGH LEVEL LANGUAGES ─── -->
  <div class="section-label">
    <span class="section-num">05</span>
    <h2>High Level Language (HLL)</h2>
  </div>
  <div class="card">
    <p>Around <span class="kw">1960</span>, the biggest revolution in programming happened — the introduction of <span class="kw">High Level Languages (HLL)</span>. These languages were designed to be as close to <strong style="color:var(--text-bright)">English</strong> as possible, using real words and symbols that humans can easily read and understand.</p>
    <p><strong style="color:var(--text-bright)">Example of HLL keywords & syntax:</strong></p>
    <div class="code-row" style="margin-top:14px;">
      <div class="code-chip green">print("Hello")</div>
      <div class="code-chip green">scan(input)</div>
      <div class="code-chip green">if / else</div>
      <div class="code-chip green">+ − * /</div>
    </div>
  </div>
  <div class="highlight-box green">
    <div class="hl-title">🔄 The Compiler</div>
    <p>Just like the Assembler, the CPU still doesn't understand English! So a powerful program called a <span class="kw">Compiler</span> was introduced. The Compiler <strong style="color:var(--text-bright)">translates the entire High Level Language code into Machine Level Language (0s and 1s)</strong> so the CPU can run it.</p>
  </div>
  <div class="card">
    <p><strong style="color:var(--text-bright)">Popular High Level Languages:</strong></p>
    <div class="code-row" style="margin-top:14px;">
      <div class="code-chip green">C</div>
      <div class="code-chip green">C++</div>
      <div class="code-chip green">Java</div>
      <div class="code-chip green">Python</div>
      <div class="code-chip green">JavaScript</div>
      <div class="code-chip green">C#</div>
    </div>
  </div>

  <!-- ─── 6. THE FULL FLOW ─── -->
  <div class="section-label">
    <span class="section-num">06</span>
    <h2>The Complete Translation Flow</h2>
  </div>
  <p style="font-size:14px; color:var(--text-muted); margin-bottom:20px; font-weight:300;">How your code travels from what you type → to what the CPU actually executes:</p>

  <div class="flow">
    <div class="flow-box">
      <div class="flow-icon green">👨‍💻</div>
      <div class="flow-content">
        <div class="flow-title">High Level Language (HLL)</div>
        <div class="flow-sub">What YOU write — e.g., print(), if/else, variables</div>
      </div>
    </div>
    <div class="flow-arrow"></div>
    <div class="flow-box">
      <div class="flow-icon purple">⚙️</div>
      <div class="flow-content">
        <div class="flow-title">Compiler</div>
        <div class="flow-sub">Translates HLL → Machine Level Language</div>
      </div>
    </div>
    <div class="flow-arrow"></div>
    <div class="flow-box">
      <div class="flow-icon blue">📄</div>
      <div class="flow-content">
        <div class="flow-title">Assembly Level Language (ALL)</div>
        <div class="flow-sub">Intermediate step — mnemonics like ADD, SUB, MUL</div>
      </div>
    </div>
    <div class="flow-arrow"></div>
    <div class="flow-box">
      <div class="flow-icon blue">🔧</div>
      <div class="flow-content">
        <div class="flow-title">Assembler</div>
        <div class="flow-sub">Converts Assembly → Binary (0s and 1s)</div>
      </div>
    </div>
    <div class="flow-arrow"></div>
    <div class="flow-box">
      <div class="flow-icon orange">🧠</div>
      <div class="flow-content">
        <div class="flow-title">Machine Level Language (MLL)</div>
        <div class="flow-sub">Pure binary — 01010, 10101… what the CPU understands</div>
      </div>
    </div>
    <div class="flow-arrow"></div>
    <div class="flow-box" style="border-color: rgba(251,146,60,0.3); background: rgba(251,146,60,0.04);">
      <div class="flow-icon orange">⚡</div>
      <div class="flow-content">
        <div class="flow-title">CPU Executes</div>
        <div class="flow-sub">Transistors switch ON/OFF → program runs!</div>
      </div>
    </div>
  </div>

  <!-- ─── 7. COMPARISON TABLE ─── -->
  <div class="section-label">
    <span class="section-num">07</span>
    <h2>Comparison: All Three Language Levels</h2>
  </div>
  <div class="card" style="padding:20px 0; overflow:hidden; border-radius:16px;">
    <table class="compare-table">
      <thead>
        <tr>
          <th>Feature</th>
          <th>Machine Level (MLL)</th>
          <th>Assembly (ALL)</th>
          <th>High Level (HLL)</th>
        </tr>
      </thead>
      <tbody>
        <tr>
          <td><strong style="color:var(--text-bright)">What it looks like</strong></td>
          <td><span class="kw">01010 10101</span></td>
          <td><span class="kw2">ADD, SUB, MUL</span></td>
          <td><span class="kw3">print(), if/else</span></td>
        </tr>
        <tr>
          <td><strong style="color:var(--text-bright)">Readability</strong></td>
          <td style="color:#f87171;">Very Difficult ❌</td>
          <td style="color:var(--accent4);">Moderate ⚠️</td>
          <td style="color:var(--accent3);">Very Easy ✅</td>
        </tr>
        <tr>
          <td><strong style="color:var(--text-bright)">CPU Understands?</strong></td>
          <td style="color:var(--accent3);">Yes ✅</td>
          <td style="color:#f87171;">No ❌</td>
          <td style="color:#f87171;">No ❌</td>
        </tr>
        <tr>
          <td><strong style="color:var(--text-bright)">Translator Needed</strong></td>
          <td>None</td>
          <td>Assembler</td>
          <td>Compiler / Interpreter</td>
        </tr>
        <tr>
          <td><strong style="color:var(--text-bright)">Error Handling</strong></td>
          <td style="color:#f87171;">Extremely Hard</td>
          <td style="color:var(--accent4);">Difficult</td>
          <td style="color:var(--accent3);">Much Easier</td>
        </tr>
        <tr>
          <td><strong style="color:var(--text-bright)">Hardware Dependent?</strong></td>
          <td style="color:#f87171;">Yes</td>
          <td style="color:#f87171;">Yes</td>
          <td style="color:var(--accent3);">No (Portable)</td>
        </tr>
        <tr>
          <td><strong style="color:var(--text-bright)">Examples</strong></td>
          <td><span class="kw">Binary sequences</span></td>
          <td><span class="kw2">x86 Assembly</span></td>
          <td><span class="kw3">C++, Java, Python</span></td>
        </tr>
      </tbody>
    </table>
  </div>

  <!-- ─── 8. TIMELINE ─── -->
  <div class="section-label">
    <span class="section-num">08</span>
    <h2>Historical Timeline</h2>
  </div>
  <div class="card">
    <div class="timeline">
      <div class="timeline-item">
        <div class="t-year">Early Days — 1940s–1950s</div>
        <div class="t-title">Machine Level Language</div>
        <div class="t-desc">The first computers were programmed directly using binary codes (0s and 1s). Programmers had to manually feed binary instructions — tedious and extremely error-prone.</div>
      </div>
      <div class="timeline-item">
        <div class="t-year">1950s — Assembly Era</div>
        <div class="t-title">Assembly Language & Assembler Introduced</div>
        <div class="t-desc">Mnemonics like ADD, SUB, MUL replaced raw binary. The Assembler program was created to automatically translate these into machine code, saving significant time.</div>
      </div>
      <div class="timeline-item">
        <div class="t-year">~1960 — The Big Revolution</div>
        <div class="t-title">High Level Languages Born</div>
        <div class="t-desc">Languages like FORTRAN and COBOL appeared. Compilers were introduced to translate human-friendly code into machine language. Programming became accessible to far more people.</div>
      </div>
      <div class="timeline-item">
        <div class="t-year">1970s–Present</div>
        <div class="t-title">Modern Languages — C, Java, Python & Beyond</div>
        <div class="t-desc">High level languages evolved rapidly. Today we use powerful languages like C++, Java, Python, JavaScript, and many more — all of which still ultimately compile down to 0s and 1s for the CPU.</div>
      </div>
    </div>
  </div>

  <!-- FOOTER -->
  <div class="footer">
    <p>📌 Source: Telusko — Fundamentals of Programming (Lesson 4.2) &nbsp;|&nbsp; Instructor: Navin Reddy</p>
    <p style="margin-top:6px; color: #3a4560;">Notes compiled for study reference</p>
  </div>

</div>
</body>
</html>
